package com.example.demo.service;

import com.example.demo.*;
import com.example.demo.dao.*;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {
	@Autowired
	 private InfoDao infoDao;
	
	public 	 boolean addInfo_usr(String id,String name,String graph,String birth_date,String gender,String tel,String address) {
		return infoDao.addInfo_usr(id,name,graph,birth_date,gender,tel,address);
	}
//	public 	 boolean addInfo_doc(String id,String name,String graph,String birth_date,String gender,String tel,String address) {
//		return infoDao.addInfo_doc(id,name,graph,birth_date,gender,tel,address);
//	}
	public boolean addInfo_doc(String id,
						String name,
						String title,
						String department,
						String hospital,
						String medicine,
						String introduction,
						String project,
						String registerID,
						int registerSum,
						int score,
						String evaluate,
						String email,
						String tel,
						String vx,
						Date registerTime){
		return infoDao.addInfo_doc(id, name, title, department, hospital, medicine, introduction, project, registerID, registerSum, score, evaluate, tel, vx, email, registerTime);
	}
	
	  public List<User> getInfo(String name) {
		  
		  return infoDao.getInfo(name);
		  		  
	  }
	  
 public List<Doctor> getInfo_doctor(String id) {
		  
		  return infoDao.getInfo_doctor(id);
		  		  
	  }

	public boolean chpswd(boolean isdoc, String id, String newpswd){
		return isdoc ? infoDao.chpswd_doc(id, newpswd) : infoDao.chpswd_usr(id, newpswd);
	}
}