package com.sid.redbus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


import com.sid.redbus.GetConnection;
public class BusImplementation {

	private static GetConnection  gConn=new GetConnection  ();


	public static GetConnection getgConn() {
		return gConn;
	}


	public static void setgConn(GetConnection gConn) {
		BusImplementation.gConn = gConn;
	}


	public static String addBusList(BusInputDTO busDto){
		System.out.println("|| Inside BusImplementation >> addBusList ||");
		String  returnVal = "SUCCESS";
		Connection conn=null;
		try{
			
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("mm/dd/yyyy");
			java.util.Date dateFrom=sdf1.parse(busDto.getFromDate());
			java.util.Date dateTo=sdf1.parse(busDto.getToDate());
			
			System.out.println( "From City :: "+busDto.getFromCity());
			System.out.println("To City :: "+busDto.getToCity());
			System.out.println("From Date :: "+busDto.getFromDate());
			System.out.println("To Date :: "+busDto.getToDate());
			
			String query = " insert into sid.RED_BUS_STORE (FROM_CITY, TO_CITY,FROM_DATE, TO_DATE,BUS_NO,BUS_NAME,IS_AC,IS_VOLVO,IS_FOOD,IS_LSEAT,SMS_ALERT,CONTACT_NUMBER)"
	        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			conn=gConn.getJNDIConnection();
		 // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString (1, busDto.getFromCity());
	      preparedStmt.setString (2, busDto.getToCity());
	      preparedStmt.setDate  (3, new java.sql.Date(dateFrom.getTime()));
	      preparedStmt.setDate(4, new java.sql.Date(dateTo.getTime()));
	      preparedStmt.setString (5, busDto.getBusNo());
	      preparedStmt.setString (6, busDto.getBusName());
	      preparedStmt.setBoolean (7, busDto.isAc());
	      preparedStmt.setBoolean (8, busDto.isVolvo());
	      preparedStmt.setBoolean (9, busDto.isFood());
	      preparedStmt.setBoolean (10, busDto.isSeparetladiesseat());
	      preparedStmt.setBoolean (11, busDto.isSmsAlert());
	      preparedStmt.setString (12, busDto.getContactNumber());
	   // execute the preparedstatement
	      preparedStmt.execute();
	      
		  }
		  catch (Exception e)
		  {
		 e.printStackTrace();
		  // here setting  returnVal = "failure" in case we received any exception while inserting into database
		 returnVal = "failure";
		  }
		finally
		{
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		  
	      

			
			
			
			return returnVal;
			
		}
	

}

	
