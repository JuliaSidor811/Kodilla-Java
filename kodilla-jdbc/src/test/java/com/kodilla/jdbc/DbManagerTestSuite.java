package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }
    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT FIRSTNAME, LASTNAME FROM USERS, POSTS WHERE POSTS.USER_ID = USERS.ID GROUP BY FIRSTNAME, LASTNAME HAVING COUNT(USER_ID) > 1";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()){
            System.out.println(rs.getString("FIRSTNAME") + " " +
                    rs.getString("LASTNAME"));
            counter ++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }

}
