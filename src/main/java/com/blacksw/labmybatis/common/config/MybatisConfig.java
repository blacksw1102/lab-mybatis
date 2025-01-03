package com.blacksw.labmybatis.common.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
public class MybatisConfig {

    @Value("${mybatis.config-location}")
    private String mybatisConfigLocation;

    @Value("${mybatis.type-aliases-package}")
    private String mybatisTypeAliasesPackage;

    @Value(("${mybatis.mapper-location}"))
    private String mybatisMapperLocation;

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource(mybatisConfigLocation));
        sqlSessionFactoryBean.setTypeAliasesPackage(mybatisTypeAliasesPackage);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources(mybatisMapperLocation));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
