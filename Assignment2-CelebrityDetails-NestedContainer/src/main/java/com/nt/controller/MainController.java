package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.CelebDTO;
import com.nt.service.CelebService;
import com.nt.vo.CelebVO;

public class MainController {
	public CelebService service;

	public MainController(CelebService service) {
		this.service = service;
	}
	public List<CelebVO> gatherCelebsByCtype(String type1,String type2,String type3)throws Exception{
		List<CelebDTO> listDTO=null;
		List<CelebVO> listVO=null;
		CelebVO vo=null;
		//use service
		listDTO=service.fetchCelebsByCtype(type1, type2, type3);
		listVO=new ArrayList();
		for(CelebDTO dto:listDTO) {
			vo=new CelebVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSerialNo(String.valueOf(dto.getSerialNo()));
			vo.setCid(String.valueOf(dto.getCid()));
			vo.setAge(String.valueOf(dto.getAge()));
			
			//add each vo to listVO
			listVO.add(vo);
			
		}
		return listVO;
	}

}
