package com.training.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.Entity.Payment;
import com.training.Entity.Product;
import com.training.Entity.TransactionRequest;
import com.training.Entity.TransactionResponse;
import com.training.Service.ProductService;

@RestController
@RequestMapping("/product")
public class Controller 
{
	@Autowired
	private ProductService productService;
	
	@PostMapping("/buyProduct")
	public TransactionResponse buyProduct(@RequestBody TransactionRequest request)
	{
		
		return productService.saveProduct(request);
		 	
	}
	
	 @GetMapping(value = "/testProduct")
	    public String productTestPage()
	    {
	        String msg="<h2 style='color:green'>Product Service Is Working!</h2>";
	        return msg;
	    }
}
