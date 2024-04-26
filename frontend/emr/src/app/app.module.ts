import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule,HttpClient} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EthnicitiesComponent } from './ethnicities/ethnicities.component';
import { core } from '@angular/compiler';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AdminComponent } from './admin/admin.component';
import { FacilityManagementComponent } from './facility-management/facility-management.component';
import { RouterModule,Routes } from '@angular/router';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { EthnicityService } from './services/ethnicity.service';
const routes: Routes = [
  {path:'ethnicities',component:EthnicitiesComponent},
  {path:'home',component:EthnicitiesComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    EthnicitiesComponent,
    HeaderComponent,
    FooterComponent,
    AdminComponent,
    FacilityManagementComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    
    RouterModule.forRoot(routes)

  ],
  providers: [
    {provide:'API_URL',useValue:'localhost:8085/ethnicities'},
    {provide:LocationStrategy,useClass:HashLocationStrategy},
    EthnicityService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
