package com.training.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.Entity.Payment;
import com.training.Entity.Product;
import com.training.Entity.TransactionRequest;
import com.training.Entity.TransactionResponse;
import com.training.Repository.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveProduct(TransactionRequest request)
	{
		String response="";
		Product product=request.getProduct();
		Payment payment=request.getPayment();
		payment.setOrderId(product.getId());
		payment.setAmount(product.getPrice());
		//do a REST call to Payment and pass Product id
		Payment paymentResponse=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment",payment,Payment.class);
		response=paymentResponse.getPaymentStatus().equals("success")?"payment processing successful and order placed":"there is failure in payment api , order added to cart";
		productRepository.save(product);
		return new TransactionResponse(product,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}
}
