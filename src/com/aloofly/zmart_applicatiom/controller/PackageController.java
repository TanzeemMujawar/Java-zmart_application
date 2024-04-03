package com.aloofly.zmart_applicatiom.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.aloofly.zmart_applicatiom.model.Product;

public class PackageController {
	public static void main(String[] aegs) {
		// Creating object of scanner class
		Scanner scanner = new Scanner(System.in);
		// creating object of Array class
		ArrayList<Product> allproduct = new ArrayList<Product>();

		// provide total number of products
		System.out.println("Enter number of products :");
		int Productcount = scanner.nextInt();
		for (int i = 0; i < Productcount; i++) {
			Product product = new Product();

			// iterate the objects
			System.out.println("Enter product id:");
			product.setId(scanner.nextInt());

			System.out.println("Enter productName");
			product.setProductname(scanner.next());

			System.out.println("Enter company Name:");
			product.setCompanyname(scanner.next());

			System.out.println("Enter price:");
			product.setPrice(scanner.next());

			System.out.println("Enter Manufacture date:");
			product.setManufacturedate(scanner.next());

			System.out.println("Enter Expiry date:");
			product.setExpiryDate(scanner.next());

			allproduct.add(product);
			System.out.println();
		}
		System.out.println("__________Product_detail_____________");
		for (int i = 0; i < allproduct.size(); i++) {

			Product currentproduct = allproduct.get(i);

			System.out.println("Product id_" + currentproduct.getId());
			System.out.println("product name_" + currentproduct.getProductname());
			System.out.println("company name_" + currentproduct.getCompanyname());
			System.out.println("Prize_" + currentproduct.getPrice());
			System.out.println("Manufacture date_" + currentproduct.getManufacturedate());
			System.out.println("Expiry date_" + currentproduct.getExpirydate());
			System.out.println();

		}

	}

}
