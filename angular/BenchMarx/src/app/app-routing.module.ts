import { OneDArrayComponent } from './one-d-array/one-d-array.component';
import { MultiDArrayComponent } from './multi-d-array/multi-d-array.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChartComponent } from './chart/chart.component';
import { AdditionComponent } from './addition/addition.component';
import { SubtractionComponent } from './subtraction/subtraction.component';
import { MultiplicationComponent } from './multiplication/multiplication.component';
import { DivisionComponent } from './division/division.component';


const routes: Routes = [
  {path:'',component:ChartComponent},
  {path:'Addition',component:AdditionComponent},
  {path:'Subtraction',component:SubtractionComponent},
  {path:'Multiplication',component:MultiplicationComponent},
  {path:'Division',component:DivisionComponent},
  {path:'MultiD',component:MultiDArrayComponent},
  {path:'OneD',component:OneDArrayComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
