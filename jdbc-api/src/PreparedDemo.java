import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {
	
	public static void main(String args[]) {
		String sql="insert into person values (?, ?, ?)";
		try {
			Connection conn=JdbcFactory.getConnection();
			PreparedStatement stmt=conn.prepareStatement(sql);
			
			stmt.setString(1, args[0]);
			stmt.setInt(2, Integer.parseInt(args[1]));
			stmt.setString(3,args[2]);
			
			stmt.executeUpdate();
			System.out.println("Record inserted");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
