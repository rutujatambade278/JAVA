package com.tfl.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.tfl.Entity.Product;

public class ProductManager {


	    public static List<Product> getSoldOutProducts() {
	        return getAllProducts().stream()
	                .filter(product -> product.getBalance() == 0)
	                .collect(Collectors.toList());
	    }

	    public static List<Product> getProductsInStockLessThan(int amount) {
	        return getAllProducts().stream()
	                .filter(product -> product.getBalance() > 0 && product.getUnitPrice() > amount)
	                .collect(Collectors.toList());
	    }

	    public static List<String> getProductTitles() {
	        return getAllProducts().stream()
	                .map(Product::getTitle)
	                .collect(Collectors.toList());
	    }

	    public static List<Product> getProductsOrderedByTitle() {
	        return getAllProducts().stream()
	                .sorted((p1, p2) -> p1.getTitle().compareTo(p2.getTitle()))
	                .collect(Collectors.toList());
	    }

	    public static List<Product> getProductsByDescendingBalance() {
	        return getAllProducts().stream()
	                .sorted((p1, p2) -> Integer.compare(p2.getBalance(), p1.getBalance()))
	                .collect(Collectors.toList());
	    }

	    public static List<Product> getProductsGroupedByCategory() {
	        return getAllProducts();
	        // Logic to group products by category and return
	    }

	    public static List<Product> getAllProducts() {
	        List<Product> allProducts = new ArrayList<>();
	        allProducts.add(new Product(1, "Gerbera", "Flower", "Wedding Flower", 6, 5000, "Per Piece", "Immediate"));
	        allProducts.add(new Product(2, "Rose", "Flower", "Valentine Flower", 15, 7000, "Per Piece", "Immediate"));
	        allProducts.add(new Product(3, "Lotus", "Flower", "Worship Flower", 26, 3400, "Per Piece", "Immediate"));
	        allProducts.add(new Product(4, "Carnation", "Flower", "Mother's love, admiration", 16, 27000, "Per Piece", "Immediate"));
	        allProducts.add(new Product(5, "Lily", "Flower", "Popular US flower", 6, 1000, "Per Piece", "Immediate"));
	        return allProducts;
	    }
	
}
