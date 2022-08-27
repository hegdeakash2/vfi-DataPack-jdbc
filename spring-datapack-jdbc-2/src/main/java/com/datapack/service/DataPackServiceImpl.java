package com.datapack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datapack.model.DataPack;
import com.datapack.repository.IDataPackRepository;
@Service
public class DataPackServiceImpl implements IDataPackService {
	@Autowired
	
	IDataPackRepository idatapack;

	@Override
	public void addDatapack(DataPack dataPack) {
idatapack.addDatapack(dataPack);		
	}

	@Override
	public void updateDatapack(double price, int id) {
		idatapack.updateDatapack(price,id);
	}

	@Override
	public void deleteDatapack(int id) {
		idatapack.deleteDatapack(id);
		
	}

	@Override
	public List<DataPack> getAll() {
		// TODO Auto-generated method stub
		return idatapack.findAll();
	}

	@Override
	public List<DataPack> getByBrand(String brand) {
		// TODO Auto-generated method stub
		return idatapack.findByBrand(brand);
	}

	@Override
	public List<DataPack> getByType(String type) {
		// TODO Auto-generated method stub
		return idatapack.findByType(type);
	}

	@Override
	public List<DataPack> duration(int duration) {
		// TODO Auto-generated method stub
		return idatapack.findByDuration(duration);
	}

	@Override
	public List<DataPack> getByPrice(double price) {
		// TODO Auto-generated method stub
		return idatapack.findByPrice(price);
	}

	@Override
	public DataPack getById(int id) {
		// TODO Auto-generated method stub
		return idatapack.findById(id);
	}
	

}
