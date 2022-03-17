package databasePackage;

/*
 * JDBC: Java Data Base Connectivity
 * Used to connect java with database
 * 7 Steps:
 * 1-import the package(java.sql.*)
 * 2-load & register the driver (mysql.connector)
 * 3-establish the connection
 * 4-create the statement 
 * 5-Execute the query
 * 6-process results
 * 7-close the connection
 */
import java.sql.*;

public class JDBCInfoClass {
	private String url = "jdbc:mysql://localhost:3306/TESTDATABASE";
	private String userName = "root";
	private String password = "bhargavchokkam";

	public static void main(String[] args) throws Exception {
//		Used to Load and register JDBC  Driver
		Class.forName("com.mysql.jdbc.Driver");
		JDBCInfoClass obj = new JDBCInfoClass();
//		obj.updateRow();
		obj.getValues();
//		obj.preparedStatementMethod();
	}

	public void getValues() throws Exception {
		String Qurey = "select * from firsttable";
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Qurey);
		while (rs.next()) {
			System.out.println(rs.getInt(1)+":"+rs.getString(2));
		}
		con.close();
		st.close();
	}
	public void updateRow() throws Exception
	{
		String Qurey = "insert into firsttable values(1686199,'chokkam');";
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		System.out.println("Count: "+st.executeUpdate(Qurey));
		con.close();
		st.close();
		
	}
	public void preparedStatementMethod() throws Exception
	{
		String Qurey = "insert into firsttable values(?,?);";
		Connection con = DriverManager.getConnection(url, userName, password);
		PreparedStatement st = con.prepareStatement(Qurey);
		st.setInt(1, 1686189);
		st.setString(2, "Ashok");
		System.out.println("Count: "+st.executeUpdate());
		
		
	}
}
