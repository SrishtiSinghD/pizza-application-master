package in.ac.sharda.pizzaapplication.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.Cart;





@RestController

public class CartController
{   
	
    public void displayItems()
    {
    	ProductListController p=new ProductListController();
    	System.out.println(p.products());
    }
    
    
    public void NumOfItems() 
    {
    	ProductListController p=new ProductListController();
    	System.out.println("Number of Products"+p.getNum());
    }
    
    
    
    @GetMapping("/Url")
    public void remove()
    {
    	ProductListController p=new ProductListController();
    	Cart c=new Cart(p.products());
    	c.removeProduct(p.products());	
    }
}