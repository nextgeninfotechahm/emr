import { HttpClient, HttpParams } from "@angular/common/http";
import { Ethnicity } from "../models/ethnicity";
import { map } from "rxjs";
import { Observable } from "rxjs";
import { Injectable, Inject } from "@angular/core";
@Injectable()
export class EthnicityService {
    //ethnicities:Ethnicity[];
    SERVICE_URL:string;
    constructor(private http:HttpClient, @Inject('API_URL') url:string){
        console.log("Injected API_URL",url);
        this.SERVICE_URL=url+"ethnicities";
    }

   
    saveEthnicity(ethnicity:Ethnicity){
        if(ethnicity.id==0){
            this.http
            .post(this.SERVICE_URL,{
                name:ethnicity.name,
                description:ethnicity.description
            }).subscribe(response=>{
                console.log("Post response is:",response);
            });
        }
        else{
            this.http
            .put(this.SERVICE_URL+'/'+ethnicity.id,{
                id:ethnicity.id,
                name:ethnicity.name,
                description:ethnicity.description
            }).subscribe(response=>{
                console.log("Put response is:",response);
            })
        }
    }
    
    getEthnicities(query?:string):Observable<Ethnicity[]>{
       let qparams;
       if(query){
            qparams=new HttpParams().append("text",query);
        }
        console.log("Query parameters",qparams);
        return this.http
        .get(this.SERVICE_URL,{params:qparams})
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

    removeEthnicity(ethnicity:Ethnicity):Observable<Object>{
        if(ethnicity.id>0){
            return this.http.delete(this.SERVICE_URL+"/"+ethnicity.id);
        }
        else{
            return new Observable<{Error:"Id is not valid"}>();
        }
    }

    getCount():number{
        let result=0;
        this.http.get(this.SERVICE_URL+"/count").subscribe(
            response=>{
                result=(<any>response);
            }
        );
        return result;
    }

    searchEthnicities(query:string):Observable<Ethnicity[]>{
        let qparams=new HttpParams();
        qparams.append("text",query);
        return this.http
        .get(this.SERVICE_URL,{params:qparams})
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