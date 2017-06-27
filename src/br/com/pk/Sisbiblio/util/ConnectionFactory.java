package br.com.pk.Sisbiblio.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/bd_biblioteca";
    private static final String USER = "root";
    private static final String PASS = "system";
        
    public static Connection getConnection() {
        
        try {
            return DriverManager.getConnection(URL,USER,PASS);
          
        } catch (SQLException e) {
            throw new RuntimeException("erro na conexão: ",e);
        }
    }

    public static void closeConnection(Connection con){
        try{
            if (con!=null){
            con.close();
            }
        }catch(SQLException e){
            System.out.println(e);
    }
    }
    
        public static void closeConnection(Connection con,PreparedStatement st){
        try{
            closeConnection(con);
            if (st!=null){
            st.close();
            }
        }catch(SQLException e){
            System.out.println(e);
    }
    }
        
       public static void closeConnection(Connection con,PreparedStatement st,ResultSet rs){
        try{
            closeConnection(con,st);
            if (rs!=null){
            rs.close();
            }
        }catch(SQLException e){
            System.out.println(e);
    }
    }
    
  
    
}