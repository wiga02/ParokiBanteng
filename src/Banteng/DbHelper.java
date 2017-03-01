/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banteng;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.h2.tools.RunScript;

/**
 *
 * @author ric
 */
public class DbHelper {

    private static Connection conn;

    static {
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:./db", "root", "root");
            checkAndInitDb();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void checkAndInitDb() throws SQLException {
        try (ResultSet rs = conn.createStatement().executeQuery("show tables");) {
            if (!rs.next()) {
                RunScript.execute(conn, new InputStreamReader(DbHelper.class.getResourceAsStream("backup.sql")));
            }
        }
    }

    public static Connection getConnection() {
        if (conn != null) {
            return conn;
        }
        try {
            if (conn.isClosed() || conn == null) {
                conn = DriverManager.getConnection("jdbc:h2:./db", "root", "root");
                return conn;
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        throw new IllegalStateException();
    }
}
