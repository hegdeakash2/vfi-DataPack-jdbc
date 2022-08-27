package com.datapack.repository;

import java.util.List;

import com.datapack.model.DataPack;

public interface IDataPackRepository {
	void addDatapack(DataPack dataPack);
	void updateDatapack( double price,int id);
	void deleteDatapack(int id);
	public List<DataPack> findAll();
	public List<DataPack> findByBrand(String brand);
	public List<DataPack> findByType(String type);
	public List<DataPack> findByDuration(int duration);
	public List<DataPack> findByPrice(double price);
	 DataPack findById(int id);

}
