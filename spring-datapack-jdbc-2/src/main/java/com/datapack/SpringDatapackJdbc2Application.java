package com.datapack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datapack.model.DataPack;
import com.datapack.service.IDataPackService;

@SpringBootApplication
public class SpringDatapackJdbc2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatapackJdbc2Application.class, args);
	}
	
	
	@Autowired
	IDataPackService iPackService;

	@Override
	public void run(String... args) throws Exception {
		DataPack dataPack=new DataPack("airtel","postpaid",84,800,29);
		iPackService.addDatapack(dataPack);
//		iPackService.updateDatapack(1800,29);
//		
//		iPackService.deleteDatapack(29);
		
		
	}

}
