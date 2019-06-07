package in.ac.sharda.pizzaapplication.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cart {
	
	private Set<Product> productsset=new TreeSet<>();
	private List<Product> products
			= new ArrayList<>();
	
	public Cart(List<Product> products) {
		this.products=products;
	}
	
	public Cart(Set<Product> productsset, List<Product> products) 
	{
		this.productsset = productsset;
		this.products = products;
	}
	public Set<Product> getProductsset() {
		return productsset;
	}
	public void setProductsset(Set<Product> productsset) {
		this.productsset = productsset;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	public void addProduct(Product product)
	{
		this.products.add(product);
	}
	public void removeProduct(List<Product> products)
	{
		this.products.clear();
	}
	
}
