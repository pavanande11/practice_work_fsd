package jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/s54";
		String username = "root";
		String password ="root";
		String query = "create table student(stuid int ,stuname varchar(20))";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		boolean res = st.execute(query);
		System.out.println(res);
	}

}
