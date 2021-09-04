package com.tom;
//public Product(Integer product_id,String Product_name,String Product_Model_Number,String Specifications)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class ECommerceService {
	static HashMap<Integer, Product> productIdMap = getproductIdMap(); //map list
	public ECommerceService(){
		super();
		if (productIdMap==null) {
			productIdMap=new HashMap<Integer, Product>();
			// Creating some objects of Product while initializing
			Product product1=new Product(1, "Laptop", "Dell 15c", "12th Generation,i5,8Gb Ram,1TB hard disk");
			Product product2=new Product(2, "Mobile", "Redami 11 pro", "6 GB ram, 128 GB Internal");
			Product product3=new Product(3, "TV", "Sony 15ci", "Full HD ,LED,SMART Tv");
			Product product4=new Product(4, "Iphone", "11", "64 GB ,IOS 14");

			 //adding map list of collections in java
			productIdMap.put(1,product1);
			productIdMap.put(2,product2);
			productIdMap.put(3,product3);
			productIdMap.put(4,product4);
			}	
	}
	public List<Product> getAllProductlist() {
	List<Product> Productlist = new ArrayList<Product>(productIdMap.values());
	return Productlist;
	}
	public Product getProduct(int id) {
	Product Product = productIdMap.get(id);
	return Product;
	}
	// add Product
	public Product addProduct(Product Product) {
	Product.setProduct_id(getMaxId()+ 1);
	// key , value
	productIdMap.put(Product.getProduct_id(), Product); ///logic class
	return Product;
	}
	//update
	public Product updateProduct(Product Product) {
	if (Product.getProduct_id() <= 0)
	return null;
	productIdMap.put(Product.getProduct_id(), Product);
	return Product;
	 }		
	//delete
	public void deleteProduct(Integer id) {
	productIdMap.remove(id);
	}
	public static HashMap<Integer, Product> getproductIdMap() {
	return productIdMap;
	}
	 //Delete all list 
	public List<Product> delAllProductlist() {
	List<Product> Productlist = new ArrayList<Product>(productIdMap.values());
	Productlist.subList(0, Productlist.size()).clear();
    System.out.println(Productlist.size());
	return Productlist;
	}
	 // Utility method to get max id for product 
	public static int getMaxId() {
	int max = 0;
	for (int id : productIdMap.keySet()) {
	if (max <= id)
	max = id;
	 }
	return max;
	}
	
}
