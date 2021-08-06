package com.shoeapp.service;

import com.shoeapp.exception.ShoeNotFoundException;
import com.shoeapp.model.Shoe;

public interface ShoeService {
	Shoe[] getByBrandName(String brand) throws ShoeNotFoundException;

	Shoe[] getBySize(int size) throws ShoeNotFoundException;
	
	Shoe[] getAll();

	Shoe getBySerialNo(int serialNo) throws ShoeNotFoundException;
}
