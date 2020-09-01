package com.nt.dao;

import java.util.List;

import com.nt.bo.CovidBO;

public interface CovidDAO {
	public List<CovidBO> getPateintsByAddr(String addr1,String addr2,String addr3)throws Exception;
}
