import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { Ethnicity } from '../models/ethnicity';
import { EthnicityService } from '../services/ethnicity.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-ethnicities',
  templateUrl: './ethnicities.component.html',
  styleUrls: ['./ethnicities.component.css']
})
export class EthnicitiesComponent implements OnInit {
  ethnicities:Ethnicity[];
  curEthinicity:Ethnicity;
  id?:string;
  query?:string;
  constructor(private service:EthnicityService,
        private router:Router,
        private route:ActivatedRoute) {
    this.curEthinicity=new Ethnicity(0,"","");
    this.ethnicities=[];
    this.route.queryParams.subscribe(params=>{this.query=params['query']||'';});
    route.params.subscribe(params=>{this.id=params['id'];});
    //this.query="";
  }

  ngOnInit(): void {
    this.service.getEthnicities().subscribe( data=>{
      this.ethnicities=data;
    });
  }
  selectEthnicity(data:Ethnicity){
    console.log("Selected Ethnicity:",data);
    this.curEthinicity=data;
  }

  save(data:any):void{
    console.log("Saving data:",data);
    this.service.saveEthnicity(this.curEthinicity);
  }

  delete():boolean{
    console.log("Removing data:");
    this.service.removeEthnicity(this.curEthinicity);
    this.curEthinicity=new Ethnicity(0,"","");
    return false;
  }

  search(query:string):void{

    console.log("Search called with query:",query);
    if(!this.query)
      return;
  }

}
