package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;


import com.nt.bo.CovidBO;
import com.nt.dao.CovidDAO;
import com.nt.dto.CovidDTO;

public class CovidServiceImpl implements CovidService {
	public CovidDAO dao;
	
	

	public CovidServiceImpl(CovidDAO dao) {
		this.dao = dao;
	}



	@Override
	public List<CovidDTO> fetchPateintsByAddr(String addr1, String addr2, String addr3) throws Exception {
		List<CovidDTO> listDTO=null;
		List<CovidBO> listBO=null;
		CovidDTO dto=null;
		//convert the input to uppercase
		addr1=addr1.toUpperCase();
		addr2=addr2.toUpperCase();
		addr3=addr3.toUpperCase();
		
		//use dao
		listBO=dao.getPateintsByAddr(addr1, addr2, addr3);
		//convert listBO to listDTO
		listDTO=new ArrayList();
		//copy eact bo to  new DTO object
		for(CovidBO bo:listBO) {
			dto=new CovidDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSerialNo(listDTO.size()+1);
			listDTO.add(dto);
			}
		return listDTO;	

	}

}
