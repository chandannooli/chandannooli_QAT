package AssignmentQs;

import java.sql.*;

public class JBDC {



		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			
			String url = "jdbc:oracle:thin:@localhost:1521/sys";
			String username = "System";
			String password = "admin1";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection created");
			Statement stmt = con.createStatement();
			
			/*String createQuery="CREATE TABLE inventory(ID NUMBER(2),NAME VARCHAR(10), DESC VARCHAR(10),STOCK NUMBER(20))";
			stmt.executeUpdate(createQuery);
			
			String insertQuery="insert into marks(id, name , desc, stock) values (1, 'Tea','Drink',120)";
			stmt.executeUpdate(insertQuery);
			insertQuery="insert into test(id, name , desc, stock) values (3, 'Sugar','Grocery',30)";
			stmt.executeUpdate(insertQuery);
			insertQuery="insert into test(id, name , desc, stock) values (4, 'Milk','Dairy',25)";
			stmt.executeUpdate(insertQuery);*/
			
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM inventory ");
			
			System.out.println("Query execution" + rs);
			
			while(rs.next()) {
				System.out.println(rs.getString("id") + " : " +  rs.getString("name")+ " : " +  rs.getString("desc")+ " : " +  rs.getString("stock"));
			}
			con.close();

		}

	}


