import { Component, OnInit, EventEmitter, Output, OnChanges, SimpleChanges } from '@angular/core';
import { Ethnicity } from '../models/ethnicity';
import { EthnicityService } from '../services/ethnicity.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-ethnicities',
  templateUrl: './ethnicities.component.html',
  styleUrls: ['./ethnicities.component.css']
})
export class EthnicitiesComponent implements OnInit, OnChanges {
  ethnicities:Ethnicity[];
  curEthinicity:Ethnicity;
  id?:string;
  query?:string;
  filtered:boolean=false;
  allLoaded:boolean=false;
  totalCount:number=0;
  rowsPerPAge=20;

  constructor(private service:EthnicityService,
        private router:Router,
        private route:ActivatedRoute) {
    this.curEthinicity=new Ethnicity(0,"","");
    this.ethnicities=[];
    this.route.queryParams.subscribe(params=>{this.query=params['query']||'';});
    route.params.subscribe(params=>{this.id=params['id'];});
    //this.query="";
  }


  ngOnChanges(changes: SimpleChanges): void {

    
  }
  ngOnInit(): void {
    this.totalCount=this.service.getCount();
    if (this.totalCount<this.rowsPerPAge)
      this.allLoaded=true;
    else
      this.allLoaded=false;
    this.refreshList();
  }
  
  selectEthnicity(data:Ethnicity){
    console.log("Selected Ethnicity:",data);
    this.curEthinicity=data;
  }


  refreshList():void{
    this.totalCount=this.service.getCount();
    this.service.getEthnicities().subscribe( data=>{
      this.ethnicities=data;
    });
  }

  resetCurrent():boolean{
    this.curEthinicity=new Ethnicity(0,"","");
    return false;
  }
  
  save(data:any):void{
    console.log("Saving data:",data);
    this.service.saveEthnicity(this.curEthinicity);
    this.refreshList();
  }

  delete():boolean{
    console.log("Removing data:");
    this.service.removeEthnicity(this.curEthinicity).subscribe(
      response=>{
        this.refreshList();
      }
    );
    this.curEthinicity=new Ethnicity(0,"","");
    return false;
  }

  private getAllEthnicities():void{
    this.service.getEthnicities().subscribe(data=>{
      console.log(data);
      this.ethnicities=data;
      this.filtered=false;
    });
  }

  private filterEthnicities(query:string){
    console.log("Calling Ethnicities service");
      this.service.getEthnicities(query).subscribe(data=>{
        console.log(data);
        this.ethnicities=data;
      });
      this.filtered=true;
  }

  search(query:string):void{
    console.log("Search called with query:",query);
    if(!query || query.length < 3){
      if (this.filtered){
        this.getAllEthnicities();        
      }
    }else{
      this.filterEthnicities(query);
    }
  }
  

}
