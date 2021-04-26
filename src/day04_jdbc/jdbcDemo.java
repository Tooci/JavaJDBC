package day04_jdbc;

import java.sql.*;

public class jdbcDemo {

    public static void main(String[] args) {
        Connection con=null;
        Statement statement=null;
        ResultSet resultSet=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","110120wu");
           String sql="update jdbc set name='黄' where id=2";
           statement=con.createStatement();
           int count=statement.executeUpdate(sql);
           resultSet=statement.executeQuery(sql);
           resultSet.next();
           int id=resultSet.getInt(2);
           String name=resultSet.getString("name");
           System.out.println(id+name);
           System.out.println(count);
       }catch (ClassNotFoundException e){
           e.printStackTrace();
       }catch (SQLException e){
           e.printStackTrace();
       }finally {
           if(con!=null){
               try {
                   con.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }
           if (statement!=null){
               try {
                   statement.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }
       }
    }
}
