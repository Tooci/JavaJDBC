package day04_jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
/*
    获取连接：getConnection()
    归还连接：Connection.close()，不会关闭连接

    C3P0:数据库连接池技术
    Druid:数据连接池实现技术，阿里巴巴提供
*    C3P0:数据库连接池技术：
    1.导入jar包：c3p0-0.9.5.2.jar  mchange-commons-java-0.2.12.jar
    2.配置文件
    3.创新核心对象，数据连接池对象
    4.获取连接getConnection
    5.
* */

public class C3P0 {
    public static void main(String[] args) {
        //1.创建连接池对象
        DataSource ds=new ComboPooledDataSource();
        //2.获取连接对象
        Connection con= null;
        try {
            con = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //3.打印
        System.out.println(con);
    }
}
