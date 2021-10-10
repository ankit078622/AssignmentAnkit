import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddproductComponent } from './product/addproduct/addproduct.component';
import { ViewproductComponent } from './product/viewproduct/viewproduct.component';

const routes: Routes = [ 
  { path: 'addproduct', component: AddproductComponent},
  { path: 'viewproduct', component: ViewproductComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
//{path:'login',Component:LoginmoduleComponent}