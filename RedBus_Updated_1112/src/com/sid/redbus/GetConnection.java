package com.sid.redbus;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

public class GetConnection {
	/** Uses JNDI and Datasource (preferred style).   */
	  Connection getJNDIConnection(){
	    String DATASOURCE_CONTEXT = "jdbc/mysqlsid";
	    
	    Connection conn = null;
	    try {
	      Context initialContext = new InitialContext();
	     /* if ( initialContext == null){
	        System.out.println("JNDI problem. Cannot get InitialContext.");
	      }*/
	      DataSource datasource = (DataSource)initialContext.lookup(DATASOURCE_CONTEXT);
	      if (datasource != null) {
	    	  conn = datasource.getConnection();
	        System.out.println("Connection is :: "+conn);
	      }
	      else {
	    	  System.out.println("Failed to lookup datasource.");
	      }
	    }
	    catch ( NamingException ex ) {
	    	System.out.println("Cannot get connection: " + ex);
	    }
	    catch(SQLException ex){
	    	System.out.println("Cannot get connection: " + ex);
	    }
	    return conn;
	  }
}
