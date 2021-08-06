package com.shoeapp.client;

import java.util.Scanner;

import com.shoeapp.exception.ShoeNotFoundException;
import com.shoeapp.model.Shoe;
import com.shoeapp.service.ShoeService;
import com.shoeapp.service.ShoeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter you choice:\n 1.Get Shoes By Serial No\n 2.Get Shoes By Brand Name\n 3.Get Shoes By Size\n 4.Get All Shoes");
		int choice = scanner.nextInt();
		ShoeService shoeReference = new ShoeServiceImpl();
		switch (choice) {
		case 1:
			System.out.println("Enter the Serial No:");
			int serialNo = scanner.nextInt();
			try {
				System.out.println(shoeReference.getBySerialNo(serialNo));
			} catch (ShoeNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("Enter the Brand Name:");
			String brandName = scanner.next();
			try {
				Shoe[] shoes = shoeReference.getByBrandName(brandName);
				for (Shoe shoe : shoes) {
					if (shoe != null) {
						System.out.println(shoe);
					}
				}
			} catch (ShoeNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("Enter the Size:");
			int size = scanner.nextInt();
			try {
				Shoe[] shoes = shoeReference.getBySize(size);
				for (Shoe shoe : shoes) {
					if (shoe != null) {
						System.out.println(shoe);
					}
				}
			} catch (ShoeNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			System.out.println("Available Shoes:");

			Shoe[] shoes = shoeReference.getAll();
			for (Shoe shoe : shoes) {
				System.out.println(shoe);
			}
			break;
		}

		scanner.close();
	}

}
