package OPERATE;

import java.sql.Connection;
import java.sql.PreparedStatement;

import signup.DB_Connection;

public class Insert_Values {
	
	public void insert_values(String Name,String Username,String Email,String Password,String Confirm_Password)
	{
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.get_connection();
		
		PreparedStatement ps = null;
		
		try
		{
			
		
			String query="INSERT INTO signup.details(Name,Username,Email,Password,Confirm_Password) values (?,?,?,?,?)";
		
		ps=connection.prepareStatement(query);
		
		ps.setString(1, Name);
		ps.setString(2, Username);
		ps.setString(3, Email);
		ps.setString(4, Password);
		ps.setString(5, Confirm_Password);
		
		ps.executeUpdate();
		
		}
		catch(Exception e) {
			System.err.println(e);
			
		}
	}

}
