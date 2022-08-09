import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the jdbc driver
		Class.forName("org.postgresql.Driver");
		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPassword = "Qwerty123";
		
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPassword);
		String insertSql = "insert into role(role_id, title) values\r\n"
				+ "(11, 'Admin'),\r\n"
				+ "(21, 'Librarian'),\r\n"
				+ "(31, 'User');";
		Statement statement = connection.createStatement();
		statement.executeUpdate(insertSql);
		statement.close();
		connection.close();
	}

}