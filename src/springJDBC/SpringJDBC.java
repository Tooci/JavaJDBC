package springJDBC;

import utils.Utis;

/*spring框架对JDBC的简单封装， 提供一个JDBCTemplate 对象简化开发
1.导入jar包 5个包
2.创建template对象 JDBCTemplate template=new JDBCTemplate(ds)
3.调用template方法完成操作 update queryForMap:Map集合长度是1； queryForList:list集合先map在list
                            query 结果 queryForObject:对象
* */
public class SpringJDBC {
    public static void main(String[] args) {
        //1
        //2
        JdbcTemplate template=new JdbcTemplate(Utis.getDataSource());
        //3调用方法
        String sql="update ";
        int con=template.update(sql,3);
        System.out.println(con);

    }
}
