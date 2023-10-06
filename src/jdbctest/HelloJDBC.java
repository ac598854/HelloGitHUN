package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloJDBC {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";//資料庫位置資訊跟使用的sample
	public static final String USER = "root";
	public static final String PASSWORD = "ac598857";

	public static void main(String[] args) {
		Connection con = null; // 宣告在try外面 後面的finally才可用
		Statement stmt = null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的部門編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的部門名稱");
		String dname = sc.next();
		System.out.println("要新增的部門所在地");
		String loc = sc.next();
		
		sc.close();
		
		try {
			// step 1:載入驅動
			Class.forName(DRIVER);// 類別載入器
			System.out.println("載入成功");
			// step 2:建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");
//			// step 3:送出SQL指令
			pstmt=con.prepareStatement("insert into department values(?, ?, ?)");//只有值可以用問號來動態表示(每次可以新增不同的資料)
			pstmt.setInt(1,deptno);
			pstmt.setString(2,dname);
			pstmt.setString(3,loc);
			
			pstmt.executeUpdate();
			
			
			
//			stmt = con.createStatement();
//			int count = stmt.executeUpdate("insert into department values(50,'人事部','中壢')");// 文字用""相對麻煩
////			新增修改刪除用executeUpdate
//			System.out.println(count + "row(s) update.");
			
//			stmt = con.createStatement();
//			rs=stmt.executeQuery("select * from department order by deptno");
//			while(rs.next()) {/*移動游標到第一行有資料會進入 沒資料回傳fales*/
//				int deptno=rs.getInt(1); //可以用欄位名稱或是索引值(從1開始且要依照select順序)
//				String dname=rs.getString("dname");
//				String loc=rs.getString("loc");
//				
//				System.out.println("DEPTNO="+deptno);
//				System.out.println("DNAME="+dname);
//				System.out.println("loc="+loc);
//				System.out.println("=============");
//				
//				
//			}
				} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
				if (con != null) {       // 檢查有無拿到連線 有拿到才關
					try {
						con.close();
					} catch (SQLException se) {
						se.printStackTrace();
					}
				}
			}
		}
	}
}
}