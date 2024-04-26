import { Component, OnInit } from '@angular/core';
import { Ethnicity } from '../models/ethnicity';
import { EthnicityService } from '../services/ethnicity.service';

@Component({
  selector: 'app-ethnicities',
  templateUrl: './ethnicities.component.html',
  styleUrls: ['./ethnicities.component.css']
})
export class EthnicitiesComponent implements OnInit {
  ethnicities?:Ethnicity[];
  constructor(private service:EthnicityService) { }

  ngOnInit(): void {
    this.service.getEthnicities().subscribe( data=>{
      this.ethnicities=data;
    });
  }

}
