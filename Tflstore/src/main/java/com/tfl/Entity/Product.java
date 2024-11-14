package com.tfl.Entity;

public class Product {
 
	  private int productId;
	    private String title;
	    private String category;
	    private String description;
	    private float unitPrice;
	    private int balance;
	    private String paymentTerm;
	    private String delivery;
	    private String imageURL;
		
	    public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(int productId, String title, String category, String description, float unitPrice, int balance,
				String paymentTerm, String delivery) {
			super();
			this.productId = productId;
			this.title = title;
			this.category = category;
			this.description = description;
			this.unitPrice = unitPrice;
			this.balance = balance;
			this.paymentTerm = paymentTerm;
			this.delivery = delivery;
			this.imageURL = imageURL;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public float getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(float unitPrice) {
			this.unitPrice = unitPrice;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public String getPaymentTerm() {
			return paymentTerm;
		}

		public void setPaymentTerm(String paymentTerm) {
			this.paymentTerm = paymentTerm;
		}

		public String getDelivery() {
			return delivery;
		}

		public void setDelivery(String delivery) {
			this.delivery = delivery;
		}

		public String getImageURL() {
			return imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}
	    
	    
}
