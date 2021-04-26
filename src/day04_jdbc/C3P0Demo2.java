package day04_jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo2 {
    public static void main(String[] args) {
        //1.创建连接池对象
//        DataSource ds=new ComboPooledDataSource();
        //2.获取连接对象
//        Connection con= null;
//        try {
//            con = ds.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        Connection con= null;
        for (int i = 0; i <10 ; i++) {
            try {
                //根据配置文件的名不同使用不同的配置
                 DataSource ds=new ComboPooledDataSource("hellc3p0");
                 con = ds.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(i+""+con);
        }

    }
}
