import { HttpClient } from "@angular/common/http";
import { Ethnicity } from "../models/ethnicity";
import { map } from "rxjs";
import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
@Injectable()
export class EthnicityService {
    //ethnicities:Ethnicity[];
    constructor(private http:HttpClient){
    }

    getEthnicities():Observable<Ethnicity[]>{
        return this.http
        .get('http://localhost:8085/ethnicities')
        .pipe(
            map(response=>{
                var items:Array<any>=(<any>response);
                return items.map(
                    item=>{
                        return new Ethnicity(
                            item.id,
                            item.name,
                            item.description
                        );
                     })
                }
            )
        );
    }
}