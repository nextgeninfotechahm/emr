import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes, Router } from '@angular/router';
import { PatientsComponent } from './patients.component';


@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})

export const routes:Routes=[
{path:'',redirectTo:'main',pathMatch:'full'},
{path:'main',component: PatientsComponent},
{path:':id',component:PatientsComponent}
]
export class PatientsModule {

 }
