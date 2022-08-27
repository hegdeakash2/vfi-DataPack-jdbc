package com.datapack.service;

import java.util.List;

import com.datapack.model.DataPack;

public interface IDataPackService {
	void addDatapack(DataPack dataPack);
	void updateDatapack(double price, int id);
	void deleteDatapack(int id);
	public List<DataPack> getAll();
	
	public List<DataPack> getByBrand(String brand);
	public List<DataPack> getByType(String type);
	public List<DataPack> duration(int brand);
	public List<DataPack> getByPrice(double price);
	public DataPack getById(int id);

}
