package tw.EEIT.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JDBC02 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/brad", prop);) {

			String name = "Brad";
			String tel = "123";
			String birthday = "1999-01-02";
			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, birthday);
			pstmt.executeUpdate();
			System.out.println("ok");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
