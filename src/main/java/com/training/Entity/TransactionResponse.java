package com.training.Entity;

public class TransactionResponse 
{
	private Product product;
	private double amount;
	private String transactionId;
	private String message;
	public TransactionResponse() {}
	public TransactionResponse(Product product, double amount, String transactionId, String message) {
		super();
		this.product = product;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
