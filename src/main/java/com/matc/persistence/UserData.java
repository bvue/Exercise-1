package com.matc.persistence;

import com.matc.entity.User;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Access users in the user table.
 *
 * @author pwaite
 */
public class UserData {

    public List<User> getAllUsers(String users_last_name) {

        List<User> users = new ArrayList<User>();
        Database database = Database.getInstance();
        Connection connection = null;

        PreparedStatement preparedStatement = null;


        String sql = "SELECT * FROM users where last_name = ?";

        try {
            database.connect();
            connection = database.getConnection();

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, users_last_name);


            //Statement selectStatement = connection.createStatement();

            //ResultSet results = selectStatement.executeQuery(sql);
            ResultSet results = preparedStatement.executeQuery();

            while (results.next()) {
                User employee = createUserFromResults(results);
                users.add(employee);
            }
            database.disconnect();
        } catch (SQLException e) {
            System.out.println("SearchUser.getAllUsers()...SQL Exception: " + e);
        } catch (Exception e) {
            System.out.println("SearchUser.getAllUsers()...Exception: " + e);
        }
        return users;
    }

    //TODO add a method or methods to return a single user based on search criteria



    private User createUserFromResults(ResultSet results) throws SQLException, ParseException {
        User user = new User();
        user.setLastName(results.getString("last_name"));
        user.setFirstName(results.getString("first_Name"));
        user.setUserid(results.getString("id"));
        user.setDateOfBirth(results.getString("date_of_birth"));
        user.calculateUserAge();
        // TODO map the remaining fields
        return user;
    }

}
