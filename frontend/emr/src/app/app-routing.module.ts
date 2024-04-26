import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EthnicitiesComponent } from './ethnicities/ethnicities.component';

const routes: Routes = [
  {path:'ethnicities',component:EthnicitiesComponent},
  {path:'home',component:EthnicitiesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
