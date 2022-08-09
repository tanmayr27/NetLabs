import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
final static String SQL_INSERT = "insert into role (role_id,title)\r\n" + "values (?,?); \r\n"+ "";
	public static void main(String[] args) {

		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPassword = "Qwerty123";
		
		try {
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPassword);
		Statement statement = connection.createStatement();
	
		//update
		String selectString="update role set title = 'Manager' where role_id = 1;";
		 statement.executeUpdate(selectString);
		 
		//delete
			 statement.executeUpdate("delete from role where role_id=2");
		 
		 
		
		//prepared statement
		PreparedStatement pstmt= connection.prepareStatement(SQL_INSERT);
		pstmt.setInt(1, 2);
		pstmt.setString(2,"Librarian");
		
		int row=pstmt.executeUpdate();
		System.out.println("Insert Done");
		
		//printing query
				ResultSet rs= statement.executeQuery("select * from role");
				while(rs.next()) {
					System.out.print(rs.getInt("role_id")+"\t"+rs.getString("title")+"\n");
				}
				rs.close();
		
		statement.close();
		connection.close();
		
		} catch(ClassNotFoundException cnfe) {
		cnfe.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}

	}

}
