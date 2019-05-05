package com.management.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * JDBC��ȡ���ݿ����ӹ�����
 */
public class JDBCUtil {
	
	private static Connection con;
	
	/**
	 * ��ȡMysql���ݿ�����
	 * @return java.sql.Connection����
	 */
	public static Connection getConnection() 
			throws ClassNotFoundException, SQLException {
		//���ݿ�����
		Class.forName("com.mysql.jdbc.Driver");
		//���ݿ����ӵ�ַ
		String url = "jdbc:mysql://localhost:3306/manager"
				+ "?useUnicode=true&characterEncoding=utf-8&useSSL=false";
		//���ݿ��û���
		String user = "root";
		//���ݿ�����
		String password = "000000";
		con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
}
