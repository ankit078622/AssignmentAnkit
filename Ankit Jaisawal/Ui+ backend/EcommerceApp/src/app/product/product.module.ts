import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddproductComponent } from './addproduct/addproduct.component';
import { EditproductComponent } from './editproduct/editproduct.component';
import { DeleteproductComponent } from './deleteproduct/deleteproduct.component';
import { FormsModule } from '@angular/forms';
import { ViewproductComponent } from './viewproduct/viewproduct.component';

@NgModule({
  declarations: [
    AddproductComponent,
    EditproductComponent,
    DeleteproductComponent,
    ViewproductComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports:[
    AddproductComponent,
    ViewproductComponent,
    EditproductComponent,
    DeleteproductComponent
  ]
})
export class ProductModule { }
