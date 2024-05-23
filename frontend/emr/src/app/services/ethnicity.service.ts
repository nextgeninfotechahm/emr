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

   
    saveEthnicity(ethnicity:Ethnicity):Observable<Object>{
        if(ethnicity.id==0){
          return  this.http
            .post(this.SERVICE_URL,{
                name:ethnicity.name,
                description:ethnicity.description
            });
        }
        else{
           return this.http
            .put(this.SERVICE_URL+'/'+ethnicity.id,{
                id:ethnicity.id,
                name:ethnicity.name,
                description:ethnicity.description
            });
        }
    }
    
    getEthnicities(query?:string,pageNo?:number):Observable<any>{
       let qparams=new HttpParams();
       if(query){
            qparams=qparams.append("text",query);
        }
        if(pageNo){
            qparams=qparams.append("pageno",pageNo);
        }
        console.log("Query parameters",qparams);
        return this.http
        .get(this.SERVICE_URL,{params:qparams})
        .pipe(
            map(response=>{
                console.log("REsponse",response);
                var resp:any=<any>response;
                var items:Array<any>=resp["results"];
                var totalPages:number=resp["totalPages"];
                var pageNo:number=resp["pageNo"];
                var results=items.map(
                    item=>{
                        return new Ethnicity(
                            item.id,
                            item.name,
                            item.description
                        );
                     });
                return [totalPages,pageNo,results];
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
 
}