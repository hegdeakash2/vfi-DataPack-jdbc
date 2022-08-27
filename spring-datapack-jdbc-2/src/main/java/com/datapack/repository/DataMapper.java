package com.datapack.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.datapack.model.DataPack;

public class DataMapper implements RowMapper<DataPack> {
	
	@Override
	public DataPack mapRow(ResultSet rs, int rowNum) throws SQLException {
		String brand=rs.getString("brand");
		String type=rs.getString("type");
		int duration=rs.getInt("duration");
		double price=rs.getDouble("price");
		int id=rs.getInt("id");
		
		DataPack datapack=new DataPack();

		
		datapack.setBrand(brand);
		datapack.setType(type);
		datapack.setDuration(duration);
		datapack.setPrice(price);
		datapack.setId(id);
		return datapack;
		
	}
	
	

}
