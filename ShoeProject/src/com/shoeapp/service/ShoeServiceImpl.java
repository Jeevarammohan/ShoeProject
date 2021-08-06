package com.shoeapp.service;

import com.shoeapp.exception.ShoeNotFoundException;
import com.shoeapp.model.Shoe;

public class ShoeServiceImpl implements ShoeService {

	@Override
	public Shoe[] getByBrandName(String brand) throws ShoeNotFoundException {
		Shoe[] shoes = getAllShoes();
		int index = 0;
		int flag = 0;
		Shoe[] shoesByBrand = new Shoe[10];
		for (Shoe shoe : shoes) {
			if (shoe.getBrandName().equals(brand)) {
				shoesByBrand[index++] = shoe;
				flag = 1;
			}
		}
		if (flag == 0) {
			throw new ShoeNotFoundException("Shoe Not Found");
		}
		return shoesByBrand;
	}

	@Override
	public Shoe[] getBySize(int size) throws ShoeNotFoundException {
		Shoe[] shoes = getAllShoes();
		int index = 0;
		int flag = 0;
		Shoe[] shoesBySize = new Shoe[10];
		for (Shoe shoe : shoes) {
			if (shoe.getSize() == size) {
				shoesBySize[index++] = shoe;
				flag = 1;
			}
		}
		if (flag == 0) {
			throw new ShoeNotFoundException("Shoe Not Found");
		}
		return shoesBySize;
	}

	@Override
	public Shoe getBySerialNo(int serialNo) throws ShoeNotFoundException {
		Shoe[] shoes = getAllShoes();
		for (Shoe shoe : shoes) {
			if (shoe.getSerialNo() == serialNo) {
				return shoe;
			}
		}
		throw new ShoeNotFoundException("Shoe Not Found");

	}

	@Override
	public Shoe[] getAll() {
		// TODO Auto-generated method stub
		return getAllShoes();
	}

	private Shoe[] getAllShoes() {
		Shoe[] shoes = new Shoe[10];
		shoes[0] = new Shoe(1, "VKC", 7, 490);
		shoes[1] = new Shoe(2, "MKC", 7, 560);
		shoes[2] = new Shoe(3, "MKC", 8, 490);
		shoes[3] = new Shoe(4, "VKC", 8, 490);
		shoes[4] = new Shoe(5, "VKC", 7, 490);
		shoes[5] = new Shoe(6, "RKC", 9, 490);
		shoes[6] = new Shoe(7, "RKC", 9, 490);
		shoes[7] = new Shoe(8, "MKC", 8, 490);
		shoes[8] = new Shoe(9, "VKC", 9, 490);
		shoes[9] = new Shoe(10, "VKC", 7, 490);
		return shoes;
	}

}
