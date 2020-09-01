package com.nt.dao;

import java.util.List;

import com.nt.bo.CelebBO;

public interface CelebDAO {
	public List<CelebBO> getCelebsByCtype(String type1,String type2,String type3)throws Exception;
	

}
