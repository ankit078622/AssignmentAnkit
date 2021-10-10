import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  // product: Product=new Product();
  // submitted = false;

  // constructor(private productservice : ProductService,
  //   private router: Router) { }

  // ngOnInit(): void {
  // }


  // newProduct(): void {
  //   this.submitted = false;
  //   this.product = new Product();
  // }

  // save() {
  //   this.productservice
  //   .addProduct(this.product).subscribe(data => {
  //     console.log(data)
  //     this.product = new Product();
  //     this.gotoList();
  //   }, 
  //   error => console.log(error));
  // }

  // onSubmit() {
  //   this.submitted = true;
  //   this.save();    
  // }

  // gotoList() {
  //   this.router.navigate(['/product']);
  // }

  constructor(private productsService: ProductService) { }

  ngOnInit(): void {
  }

  addNewProduct(form : any){
    console.log(form.value);

    let newProduct = {
       
      category: form.value.product_category,
      description: form.value.product_description,
      manufacturer: form.value.product_manufacturer,
      name: form.value.product_name,
      price: form.value.product_price,
      unit: form.value.product_unit

       
    };

    console.log(newProduct);

    this.productsService.addProduct(newProduct).subscribe(data => {
      console.log(data);
    });
}}
