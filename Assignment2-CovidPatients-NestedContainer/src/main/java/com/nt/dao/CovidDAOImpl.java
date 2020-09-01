package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.CovidBO;

public class CovidDAOImpl implements CovidDAO {
	private static final String GET_PATIENTS_BY_ADDR="SELECT PID,PNAME,AGE,PADDR,GENDER FROM COVID WHERE PADDR IN(?,?,?)ORDER BY PADDR";
	
	private DataSource ds;
	public CovidDAOImpl(DataSource ds) {
		this.ds = ds;
	}



	@Override
	public List<CovidBO> getPateintsByAddr(String addr1, String addr2, String addr3) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<CovidBO> listBO=null;
		CovidBO bo=null;
		//get the jdbc pooled connection object
		try {
			con=ds.getConnection();
			//get preparedstatement object
			ps=con.prepareStatement(GET_PATIENTS_BY_ADDR);
			//set values to  query patameters
			ps.setString(1, addr1);
			ps.setString(2, addr2);
			ps.setString(3, addr3);
			
			//execute the query
			rs=ps.executeQuery();
			
			//convert the resultset objects into listBO
			listBO=new ArrayList();
			while(rs.next()) {
				bo=new CovidBO();
				//copy each record from resultset to  listBO
				bo.setPid(rs.getInt(1));
				bo.setPname(rs.getString(2));
				bo.setAge(rs.getInt(3));
				bo.setPaddr(rs.getString(4));
				bo.setGender(rs.getString(5));
				
				listBO.add(bo);
			}
		}catch(SQLException se) { //known exception
			se.printStackTrace();
			throw se;  //exception rethrowing..
		}
		catch(Exception e) {  
			e.printStackTrace();
			throw e;
		}
		finally {
			//close jdbc objs
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;  
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se; 
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se; 
			}
		}//finally
		
		
		
		return listBO;
	}

}
