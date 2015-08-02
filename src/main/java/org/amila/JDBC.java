/*
    This file is part of OpenSinhalaEnglishDictionary.

    OpenSinhalaEnglishDictionary is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    OpenSinhalaEnglishDictionary is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with OpenSinhalaEnglishDictionary.  If not, see <http://www.gnu.org/licenses/>.
 */
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
