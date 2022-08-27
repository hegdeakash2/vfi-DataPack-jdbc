package com.datapack.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.datapack.model.DataPack;

import comdatapack.util.DBQueries;

@Repository
public class DataPackRepositoryImpl implements IDataPackRepository {
	private JdbcTemplate jdbctemplate;

	@Autowired
	public void setjdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public void addDatapack(DataPack dataPack) {
		Object[] dataArray = { dataPack.getBrand(), dataPack.getId(), dataPack.getDuration(), dataPack.getPrice(),
				dataPack.getType() };
		jdbctemplate.update(DBQueries.INSERTQUERY,dataArray);

	}

	@Override
	public void updateDatapack(double price, int id) {
		String sql = DBQueries.UPDATEQUERY;
		jdbctemplate.update(sql, price, id);

	}

	@Override
	public void deleteDatapack(int id) {
		String sql = DBQueries.UPDATEQUERY;
		jdbctemplate.update(DBQueries.DELETEQUERY, id);

	}

	@Override
	public List<DataPack> findAll() {
		RowMapper<DataPack> mapper = new DataMapper();
		List<DataPack> datapacks = jdbctemplate.query(DBQueries.SELECTQUERY, mapper);
		return datapacks;
	}

	@Override
	public List<DataPack> findByBrand(String brand) {

		List<DataPack> datapacks = jdbctemplate.query(DBQueries.SELECTBYBRAND, (rs, column) -> {
			DataPack datapack = new DataPack();
			datapack.setBrand(rs.getString("brand"));
			datapack.setType(rs.getString("type"));
			datapack.setPrice(rs.getDouble("price"));
			datapack.setDuration(rs.getInt("duration"));

			int id = rs.getInt("id");
			datapack.setId(id);

			return datapack;

		}, brand);
		return datapacks;
	}

	@Override
	public List<DataPack> findByType(String type) {
		List<DataPack> datapacks = jdbctemplate.query(DBQueries.SELECTBYTYPE, (rs, rowNum) -> {
			DataPack datapack = new DataPack();
			datapack.setBrand(rs.getString("brand"));
			datapack.setType(rs.getString("type"));
			datapack.setPrice(rs.getDouble("price"));
			datapack.setDuration(rs.getInt("duration"));

			int id = rs.getInt("id");
			datapack.setId(id);

			return datapack;

		}, type);
		return datapacks;
	}

	@Override
	public List<DataPack> findByDuration(int duration) {
		List<DataPack> datapacks = jdbctemplate.query(DBQueries.SELECTBYDURATION, (rs, rowNum) -> {
			DataPack datapack = new DataPack();
			datapack.setBrand(rs.getString("brand"));
			datapack.setType(rs.getString("type"));
			datapack.setPrice(rs.getDouble("price"));
			datapack.setDuration(rs.getInt("duration"));

			int id = rs.getInt("id");
			datapack.setId(id);

			return datapack;

		}, duration);
		return datapacks;
	}

	@Override
	public List<DataPack> findByPrice(double price) {
		List<DataPack> datapacks = jdbctemplate.query(DBQueries.SELECTBYPRICE, (rs, rowNum) -> {
			DataPack datapack = new DataPack();
			datapack.setBrand(rs.getString("brand"));
			datapack.setType(rs.getString("type"));
			datapack.setPrice(rs.getDouble("price"));
			datapack.setDuration(rs.getInt("duration"));

			int id = rs.getInt("id");
			datapack.setId(id);

			return datapack;

		}, price);
		return datapacks;
	}

	@Override
	public DataPack findById(int id) {
		DataPack ndatapack = jdbctemplate.queryForObject(DBQueries.SELECTBYID, (rs, rowNum) -> {

			DataPack datapack = new DataPack();
			datapack.setBrand(rs.getString("brand"));
			datapack.setType(rs.getString("type"));
			datapack.setPrice(rs.getDouble("price"));
			datapack.setDuration(rs.getInt("duration"));

			datapack.setId(id);

			return datapack;

		}, id);
		return ndatapack;
	}

}
