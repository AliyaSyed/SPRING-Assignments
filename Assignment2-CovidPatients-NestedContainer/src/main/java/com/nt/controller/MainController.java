package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.CovidDTO;
import com.nt.service.CovidService;
import com.nt.vo.CovidVO;

public class MainController {
	public CovidService service;

	public MainController(CovidService service) {
		this.service = service;
	}
	public List<CovidVO> gatherPatientsByAddr(String addr1,String addr2,String addr3)throws Exception{
		List<CovidDTO> listDTO=null;
		List<CovidVO> listVO=null;
		CovidVO vo=null;
		//use service
		listDTO=service.fetchPateintsByAddr(addr1, addr2, addr3);
		listVO=new ArrayList();
		for(CovidDTO dto:listDTO) {
			vo=new CovidVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSerialNo(String.valueOf(dto.getSerialNo()));
			vo.setPid(String.valueOf(dto.getPid()));
			vo.setAge(String.valueOf(dto.getAge()));
			
			//add each vo to listVO
			listVO.add(vo);
			
		}
		return listVO;
	}

}
