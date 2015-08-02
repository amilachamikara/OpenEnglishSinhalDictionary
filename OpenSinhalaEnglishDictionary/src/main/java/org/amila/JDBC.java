package org.amila;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Amila
 */
public class JDBC {

    private static Connection connection;

    private static Connection getConnection() throws Exception {
        if (connection == null) {
            String database = "jdbc:sqlite::resource:db/ensidb.db";
            connection = DriverManager.getConnection(database);
            return connection;
            
        }else{
            return connection;
        }
    }
    
    public ResultSet getData(String query)throws Exception{
        return getConnection().createStatement().executeQuery(query);
    }
    
    
    
}
