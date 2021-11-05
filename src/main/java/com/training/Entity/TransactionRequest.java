package com.training.Entity;

public class TransactionRequest 
{
	private Product product;
	private Payment payment;
	public TransactionRequest() {}
	public TransactionRequest(Product product, Payment payment) {
		super();
		this.product = product;
		this.payment = payment;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
