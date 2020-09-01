package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.CelebBO;

public class CelebDAOImpl implements CelebDAO {
private static final String GET_CELEBS_BY_CTYPE="SELECT CID,CNAME,CINDUSTRY,AGE,CTYPE FROM CELEBS WHERE CTYPE IN(?,?,?)ORDER BY CTYPE";
	
	public DataSource ds;
	public CelebDAOImpl(DataSource ds) {
		this.ds = ds;
	}



	@Override
	public List<CelebBO> getCelebsByCtype(String type1, String type2, String type3) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<CelebBO> listBO=null;
		CelebBO bo=null;
		//get the jdbc pooled connection object
		try {
			con=ds.getConnection();
			//get preparedstatement object
			ps=con.prepareStatement(GET_CELEBS_BY_CTYPE);
			//set values to  query patameters
			ps.setString(1, type1);
			ps.setString(2, type2);
			ps.setString(3, type3);
			
			//execute the query
			rs=ps.executeQuery();
			
			//convert the resultset objects into listBO
			listBO=new ArrayList();
			while(rs.next()) {
				bo=new CelebBO();
				//copy each record from resultset to  listBO
				bo.setCid(rs.getInt(1));
				bo.setCname(rs.getString(2));
				bo.setcIndustry(rs.getString(3));
				bo.setAge(rs.getInt(4));
				bo.setcType(rs.getString(5));
				
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
