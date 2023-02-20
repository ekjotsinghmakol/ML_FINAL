package com.bhavna.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bhavna.bean.Sneakers;
import com.bhavna.utility.MyConnection;

public class Operations {

	Connection connection = MyConnection.connection();

	public void insertData(Sneakers sneakers) {

		try (Connection connection = MyConnection.connection();
				PreparedStatement pstat = connection.prepareStatement("insert into sneakers values(?,?,?,?)");) {
			pstat.setInt(1, sneakers.getId());
			pstat.setString(2, sneakers.getShoeName());
			pstat.setDouble(3, sneakers.getShoePrice());
			pstat.setString(4, sneakers.getColour());

			int i = pstat.executeUpdate();
			System.out.println("Record inserted");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void getData() {
		try (Connection connection = MyConnection.connection();
				Statement stat = connection.createStatement();
				ResultSet resultSet1 = stat.executeQuery("select * from sneakers");) {

			while (resultSet1.next()) {
				System.out.println(resultSet1.getInt(1) + " " + resultSet1.getString(2) + " " + resultSet1.getDouble(3)
						+ " " + resultSet1.getString(4));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void updateData(Sneakers sneakers) {
		try (Connection connection = MyConnection.connection();
				PreparedStatement pstat2 = connection
						.prepareStatement("update sneakers set shoePrice =? where id =?");) {
			pstat2.setDouble(1, sneakers.getShoePrice());
			pstat2.setInt(2, sneakers.getId());
			int j = pstat2.executeUpdate();
			System.out.println("Record updated");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
