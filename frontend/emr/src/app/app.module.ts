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
import { EthinicityComponent } from './ethinicity/ethinicity.component';
import { EthinicityEditComponent } from './ethinicity-edit/ethinicity-edit.component';
import { FormsModule, FormControl } from '@angular/forms';
import { EthnicitySearchComponent } from './ethnicity-search/ethnicity-search.component';
import { AuthService } from './services/auth.service';
import { LoginComponent } from './login/login.component';
import { LoggedInGuard } from './logged-in.guard';
LoggedInGuard
@NgModule({
  declarations: [
    AppComponent,
    EthnicitiesComponent,
    HeaderComponent,
    FooterComponent,
    AdminComponent,
    FacilityManagementComponent,
    EthinicityComponent,
    EthinicityEditComponent,
    EthnicitySearchComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [
    {provide:'API_URL',useValue:'http://localhost:8085/'},
    {provide:LocationStrategy,useClass:HashLocationStrategy},
    EthnicityService,
    AuthService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
