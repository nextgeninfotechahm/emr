import { Component, OnInit, Input, HostBinding } from '@angular/core';
import { Ethnicity } from '../models/ethnicity';
@Component({
  selector: 'app-ethinicity',
  templateUrl: './ethinicity.component.html',
  styleUrls: ['./ethinicity.component.css']
})
export class EthinicityComponent implements OnInit {
  @Input() ethnicity?:Ethnicity;
  @HostBinding('attr.class') cssClass="ui row link blue active";
  constructor() { }

  ngOnInit(): void {
  }


}
