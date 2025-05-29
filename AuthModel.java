import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthModel {
	Connection con= null;
	PreparedStatement pstmt = null;
	String drive = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/august?user=root&password=nagavijaya";
	String sql = "insert into user(username,password,email,phone) values(?,?,?,?)";
	PreparedStatement pstmt1 = null;
	ResultSet rs = null;
	String loginsql = "select * from user where username=? and password=?";
	public AuthModel() {
		try {
			Class.forName(drive);
			con=DriverManager.getConnection(url);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean persist(String username, String password, String email,String phone) {
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			pstmt.setString(3,email);
			pstmt.setString(4,phone);
			int nora=pstmt.executeUpdate();
			if(nora==1) {
				return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false; 
	}
	
	public boolean validateUser(String username, String password) {
		try {
			pstmt1=con.prepareStatement(loginsql);
			pstmt1.setString(1,username);
			pstmt1.setString(2,password);
			rs=pstmt1.executeQuery();
			if(rs.next()) {
				return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false; 
	}
}
