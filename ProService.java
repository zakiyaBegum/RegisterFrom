package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProService 
{
	
	@Autowired
	ProRepository repo;
	
	void addData(DataClass dc) {
		repo.save(dc);
	}
	
	@SuppressWarnings("deprecation")
	DataClass getData(int id) {
		return repo.getById(id);
	}
	
	void updateData(DataClass dc) {
		repo.save(dc);		
	}
	
	void deleteData(int id) {
		repo.deleteById(id);
	}
	
	
	
}
