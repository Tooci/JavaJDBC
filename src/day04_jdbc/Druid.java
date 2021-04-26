package day04_jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/*
*   1.导入jar包 druid-1.0.9.jar
*   2.配置文件 properties 通过工程来获取
*   3.获取连接池
*
* */
public class Druid {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2
        //3,加载配置文件
        Properties pro=new Properties();
        InputStream is=Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        DataSource ds=DruidDataSourceFactory.createDataSource(pro);

        Connection con=ds.getConnection();
        System.out.println(con);
    }
}
