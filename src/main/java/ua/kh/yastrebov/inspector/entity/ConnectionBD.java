package ua.kh.yastrebov.inspector.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    private static final String URL  = 
            "jdbc:mysql://localhost:3306/Inspector?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection connection;   
    
    public static Connection getConnection(){
        if (connection == null){
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            } 
            catch(SQLException e) {
                e.printStackTrace();
                System.out.println("Ошибка подключения к БД");
            }
            catch(ClassNotFoundException ex){
                ex.printStackTrace();
                System.out.println("Не найдет дравйер JDBC");
            }
        }
        return connection;
    }
}