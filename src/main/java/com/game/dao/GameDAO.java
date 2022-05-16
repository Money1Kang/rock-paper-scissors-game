package com.game.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.game.utils.DBUtils;

public class GameDAO {
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private PreparedStatement preparedStatement;

	
	public int save(int userId, String userName, String password, int isLogin) {
		final String insertQuery = "INSERT INTO user (user_id, user_name, password, is_login) VALUES (?,?,?,?)";
		int affectedRows = 0;
		try (
				// java�� MySQL�� ������� (Connection) ����
				Connection connection = DBUtils.getConnection();
				// ��θ� ���� SQL�� ������ ��ü Statement ����
				PreparedStatement preparedStatement = createPrepaeredStatement(connection, insertQuery, userId, userName, password, isLogin);
				// ���� ���� ���� �� ���� (���� ����)
			)
		{
			affectedRows = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return affectedRows;
	}


	private PreparedStatement createPrepaeredStatement(Connection connection, String sql, int userId,
			String userName, String password, int isLogin) throws SQLException {
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, userId);
		preparedStatement.setString(2, userName);
		preparedStatement.setString(3, password);
		preparedStatement.setInt(4, isLogin);
		
		return preparedStatement;
	}

}
