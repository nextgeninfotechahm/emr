import { Component, OnInit,Input, Output } from '@angular/core';
import { FormsModule, FormControl, FormGroup } from '@angular/forms';
import { Ethnicity } from '../models/ethnicity';
import { EventEmitter } from 'stream';
@Component({
  selector: 'app-ethinicity-edit',
  templateUrl: './ethinicity-edit.component.html',
  styleUrls: ['./ethinicity-edit.component.css']
})
export class EthinicityEditComponent implements OnInit {
  @Input() ethnicity?:Ethnicity
  
  constructor() { }

  ngOnInit(): void {
    
  }

  save(value:FormGroup){
    console.log(value);
  }

  ethnicitySelected(ethnicity:Ethnicity){
    console.log("Ethnicity was clicked:",ethnicity);
    this.ethnicity=ethnicity;
  }
  //EthnicitySelected($event)
}
