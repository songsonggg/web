package com.example.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.web")
@MapperScan("com.example.web.mapper")
public class WebApplication {

	/*
	一： Maven
	1. clean 是 clean   mvn compile出来的target目录
	2. package 是把target打出个jar包，放到target目录下
	3. install 是把jar放到本地maven仓库，deploy 放到远程的（没用过）
	4. 本地仓库 ~/.m2/repository， idea用settings.xml换阿里云的maven源，需要刷新下，点Maven重新拉取下
	5. 换源需要重新启动，或者重刷，要不然不一定能解析成功
	6. 在pom.xml里加了什么，右键pom.xml reimport下

	二： Spring WEB/MVC:
	1. @RestController = @Controller + @ResponseBody
	2. 如果没有@ResponseBody view resolver 有问题，如果不返回相对的MV(?)
	3. 中文乱码问题（设置详情application.yml）:
	    1. server-tomcat-url-encoding
	    2. spring-http-encoding-charset
	    3. mysql 设置
	    4. spring-datasource-url=jdbc:mysql://localhost:3306/songsongmall?characterEncoding=UTF-8

	三： Spring Boot:
	1. application.properties 和 application.yml
	    1. a-b-c ==   a: b: c:
	    2. yml要注意空格， properties 不确定

	四： Mysql -> Druid(数据库连接池)  (DruidConfig.java)
	1. Mysql 指定下 spring.datasource.url/username/password/driver-class-name(这个可能不需要了)
	2. Druid 需要
	     1. mysql application.yml 配置 + druid application.yml 配置
	     2. 写个DruidConfig, 加上@ConfigurationProperties(prefix="spring.datasource")
	     3. 然后就可以直接写@Bean DruidDataSource
	3. Druid 监控 （注册2个Bean 和 application.yml 配置）
	4. DruidDatasource 就可以获取连接直接访问数据库了，不过要自己手动关闭 (ResultSet/PreparedStatement/Connection)

	五: JDBCTemplate
	1. 首先要有Mysql/DataSource,然后就可以 @Bean new JdbcTemplate(DataSource)
	2. 好处不用自己关闭任何东西，有例外(SmartDataSource)
	3. 不过要 匿名类实现一个RowMapper<T>的 T mapRow(ResultSet, index) 方法，基本上
	   就是从ResultSet获取相应的列，然后set到pojo里，还是挺麻烦的。


	六：Mybatis (JdbcTemplate再升级):
	解释：
	首先他自带datasource, spring-datasource-type 也可以指定其他的。 并且也会自动释放连接。

	1. 定位Interface Mapper: @MapperScan("com.example.web.mapper")， 那么Interface Mapper 并不需要@Mapper
	2. Interface Mapper 要定位 相关的 *.xml 需要在 application.xml 配置 mapper-locations的位置
	3. 小知识： classpath就是定位到 生成的target/classes下面的文件
	4. 小心： plugin mybatis-generate 生成的可能有错，LocalDateTime 就是其中一个
	5. 不重要：application.xml 里的 config-location 配置的其他mybatis的配置 （我没用到过）


	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext= SpringApplication.run(WebApplication.class, args);
	}

}
