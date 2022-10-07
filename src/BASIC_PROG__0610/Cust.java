package BASIC_PROG__0610;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cust {
 private static Connection con;
 private static Statement st;
 private static ResultSet rs;
	
 public static void create() throws ClassNotFoundException, SQLException {
  con = DBConnection.connect();
  st = con.createStatement();
  st.execute("create table travels(Acc_No number,Account_Holder varchar2(30),Pin_Number number,Account_Balance number)");
  st.executeUpdate("insert into Cust values(101,'Suresh',2343,25,234)");
  st.executeUpdate("insert into Cust  values(102,'Ganesh',5432,34,123)");
  st.executeUpdate("insert into Cust  values(103,'Magesh',7854,26,100)");
  st.executeUpdate("insert into Cust  values(104,'Naresh',2345,80,000)");
  st.executeUpdate("insert into Cust  values(105,'Harish',1907,103,000)");
  read();
 }

 public static void read() throws ClassNotFoundException, SQLException {
  con = DBConnection.connect();
  st = con.createStatement();
  rs = st.executeQuery("select * from travels");
  while (rs.next())
   System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
     + " " + rs.getString(5));
 }

 public static void main(String[] args) {
  try {
   create();
  } catch (ClassNotFoundException e) {
   System.err.println(e);
  } catch (SQLException e) {
   System.err.println(e);
  }
 }
}
