package com.nt.service;

import java.util.List;

import com.nt.dto.CelebDTO;

public interface CelebService {
	public List<CelebDTO> fetchCelebsByCtype(String type1,String type2,String type3)throws Exception;
}
