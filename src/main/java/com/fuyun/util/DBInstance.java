package com.fuyun.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;



public class DBInstance {
	// private static final String url =
	// "jdbc:mysql://106.14.207.159:8772/novel";

	private static final String configFile = "dbcp.properties";
	private static DataSource dataSource;
	static {
		Properties dbProperties = new Properties();
		try {
			dbProperties.load(DBInstance.class.getClassLoader().getResourceAsStream(configFile));
			dataSource = BasicDataSourceFactory.createDataSource(dbProperties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private DBInstance() {

	}

	/**
	 * 获取链接，用完后记得关闭
	 * 
	 * @see {@link DBManager#closeConn(Connection)}
	 * @return
	 */
	public static final Connection getConn() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			System.out.println("获得连接失败");
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 关闭连接
	 * 
	 * @param conn
	 *            需要关闭的连接
	 */
	public static void close(Connection conn,PreparedStatement pre,ResultSet rs) {
		try {
			if(rs!=null){
				rs.close();
			}
			
			if(pre!=null){
				pre.close();
			}
			
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("关闭数据库连接失败");
		}
	}

}
