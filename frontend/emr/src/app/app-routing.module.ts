import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EthnicitiesComponent } from './ethnicities/ethnicities.component';

import { LoginComponent } from './login/login.component';
import { LoggedInGuard } from './logged-in.guard';
const routes: Routes = [
  {path:'ethnicities',component:EthnicitiesComponent,canActivate:[LoggedInGuard]},
  {path:'ethnicities/:id',component:EthnicitiesComponent},
  {path:'home',component:EthnicitiesComponent},
  {path:'login',component:LoginComponent},
  {path:'logout',component:LoginComponent},
  {path:'patients',component:LoginComponent, children:patientRoutes},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
