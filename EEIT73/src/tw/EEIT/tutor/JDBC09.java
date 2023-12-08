package tw.EEIT.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import org.json.JSONStringer;
import org.json.JSONWriter;

import tw.EEIT.classes.BCrypt;
import tw.EEIT.classes.Member;

public class JDBC09 {
	private static Connection conn;
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1/brad";
	private static final String SQL_LOGIN = "SELECT * FROM member WHERE account = ?";
	private static final String SQL_CHPASSWD = "UPDATE member SET password = ? WHERE id = ?";

	public static void main(String[] args) {
		// User Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Acount:");
		String account = scanner.next();
		System.out.print("PassWord:");
		String password = scanner.next();

		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			conn = DriverManager.getConnection(URL, prop);
			// check account
			Member member ;
			if ((member = login(account, password)) != null) {
				System.out.println("Welcome, " + member.getCname());
				
				//產生 Member JSON
				JSONStringer js = new JSONStringer();
				JSONWriter jw = js.object();
				js.key("id").value(member.getId());
				js.key("account").value(member.getAccount());
				js.endObject();
				System.out.println(jw.toString());
				
				System.out.print("New Password: ");
				String newpasswd = scanner.next();
				if(chPasswd(member, newpasswd)) {
					System.out.println("New Password changed");
				}else {
					System.out.println("Password change ERROR");
				}
			}else {
				System.out.println("Login Failure");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	static Member login(String account,String password ) {
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL_LOGIN);
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String hashPasswd = rs.getString("password");
				if (BCrypt.checkpw(password, hashPasswd)) {
					// OK
					Member member = new Member(rs.getInt("id"), 
							rs.getString("account"), 
							rs.getString("cname"));
					return member;
				}else {
					// ERR
					return null;
				}
			}else {
				//ERROR
				return null;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	static boolean chPasswd(Member member,String newpasswd) {
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL_CHPASSWD);
			pstmt.setString(1, BCrypt.hashpw(newpasswd, BCrypt.gensalt()));
			pstmt.setInt(2, member.getId());
			int num = pstmt.executeUpdate();
			if(num == 1) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
