package BASIC_PROG__0610;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBConnection {
	private static Connection con;
	public static Connection connect() throws ClassNotFoundException, SQLException {
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","system","admin");
	 return con;
	}
	}

