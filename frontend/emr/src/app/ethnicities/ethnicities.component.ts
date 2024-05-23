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
  curPage:number=1;
  totalPages:number=1;

  constructor(private service:EthnicityService,
        private router:Router,
        private route:ActivatedRoute) {
    this.curEthinicity=new Ethnicity(0,"","");
    this.ethnicities=[];
    this.route.queryParams.subscribe(params=>{this.query=params['query']||'';});
    route.params.subscribe(params=>{this.id=params['id'];});
  }


  ngOnChanges(changes: SimpleChanges): void {

    
  }

  ngOnInit(): void {
    this.refreshList();
  }
  
  selectEthnicity(data:Ethnicity){
    console.log("Selected Ethnicity:",data);
    this.curEthinicity=data;
  }


  refreshList():void{
    this.totalCount=this.service.getCount();
    this.service.getEthnicities(this.query,this.curPage-1).subscribe(
        data=>{
          console.log(data);
          this.curPage=data[1]+1;
          this.totalPages=data[0];
          this.ethnicities=data[2];
        }
      );
  }

  resetCurrent():boolean{
    this.curEthinicity=new Ethnicity(0,"","");
    return false;
  }
  
  save(data:any):void{
    console.log("Saving data:",data);
    this.service.saveEthnicity(this.curEthinicity).subscribe(response=>{
      console.log("Save Response",response);
      this.refreshList();
    
    });
    this.resetCurrent();
    
  }

  delete():boolean{
    console.log("Removing data:");
    this.service.removeEthnicity(this.curEthinicity).subscribe(
      response=>{
        this.refreshList();
      }
    );
    return this.resetCurrent();
  }

  search(query:string):void{
    console.log("Search called with query:",query);
    this.query=query;
    this.refreshList();
  }

  fetchPage(page:number):boolean{
    //this.filterEthnicities();
    this.curPage=page;
    this.refreshList();
    return false;

  }
  
  getNumbers():Array<number>{
    let nums=[];
    for(let i=1;i<=this.totalPages;i++){
      nums.push(i);
    }
    return nums;
  
  }

}
