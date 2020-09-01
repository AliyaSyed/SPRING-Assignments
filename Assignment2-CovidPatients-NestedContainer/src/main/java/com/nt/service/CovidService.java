package com.nt.service;

import java.util.List;

import com.nt.dto.CovidDTO;

public interface CovidService {
	public List<CovidDTO> fetchPateintsByAddr(String addr1,String addr2,String addr3)throws Exception;
}
