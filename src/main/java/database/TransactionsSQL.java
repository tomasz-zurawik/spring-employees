package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionsSQL {

    public static void transactions(Connection conn, PreparedStatement ps) {
        try {
            conn.setAutoCommit(Boolean.FALSE);

            int rowInsert = ps.executeUpdate();
            if (rowInsert > 0) {
                System.out.println("Success!");
            }
            conn.commit();
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                conn.setAutoCommit(Boolean.TRUE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void transactions(Connection conn, String query) {
        if(query == null)
            return;

        try {
            conn.setAutoCommit(Boolean.FALSE);
            Statement s = conn.createStatement();
            System.out.println(query);
            int rowInsert = s.executeUpdate(query);
            if (rowInsert > 0) {
                System.out.println("Success!");
            }

            conn.commit();
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                conn.setAutoCommit(Boolean.TRUE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
