package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CelebBO;
import com.nt.dao.CelebDAO;
import com.nt.dto.CelebDTO;
import com.nt.dto.CelebDTO;

public class CelebServiceImpl implements CelebService {
	
public CelebDAO dao;
	
	

	public CelebServiceImpl(CelebDAO dao) {
		this.dao = dao;
	}


	@Override
	public List<CelebDTO> fetchCelebsByCtype(String type1, String type2, String type3) throws Exception {
		List<CelebDTO> listDTO=null;
		List<CelebBO> listBO=null;
		CelebDTO dto=null;
		
		
		//use dao
		listBO=dao.getCelebsByCtype(type1, type2, type3);
		//convert listBO to listDTO
		listDTO=new ArrayList();
		//copy eact bo to  new DTO object
		for(CelebBO bo:listBO) {
			dto=new CelebDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSerialNo(listDTO.size()+1);
			listDTO.add(dto);
			}
		return listDTO;	

	}


}
