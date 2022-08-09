import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryProgram {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPassword = "Qwerty123";
		
		try {
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPassword);
	
		Statement statement = connection.createStatement();
	
		String selectString="select * from role";
		ResultSet rs= statement.executeQuery(selectString);
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
