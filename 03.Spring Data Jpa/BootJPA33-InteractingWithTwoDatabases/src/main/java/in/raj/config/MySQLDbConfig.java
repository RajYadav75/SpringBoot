package in.raj.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "in.raj.repository.offers",entityManagerFactoryRef = "mysqlEMF",transactionManagerRef = "mysqlTxMgmr")
public class MySQLDbConfig {
    //TODO:- DataSource Object
    @Bean("mysqlDs")
    @ConfigurationProperties(prefix = "mysql.ds")
    public DataSource createMySQLDataSource() {
        return DataSourceBuilder.create().build();
    }
    //TODO:- LocalContainerEntityManagerFactoryBean that gives EntityManagerFactory object
    @Bean("mysqlEMF")
//    @Primary
    public LocalContainerEntityManagerFactoryBean createLCEMFBForMySQL(EntityManagerFactoryBuilder builder){
        //TODO:- Prepare HB Properties
        Map<String,String> map = new HashMap<>();
        map.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
        map.put("hibernate.show_sql","true");
        map.put("hibernate.format_sql","true");
        map.put("hibernate.hbm2ddl.auto","update");
        //TODO:- Create LocalContainerEntityManagerFactoryBean class Object using EntityManagerFactoryBuilder Object
        return builder.dataSource(createMySQLDataSource()).packages("in.raj.entity.offers").properties(map).build();
    }

    @Bean("mysqlTxMgmr")
//    @Primary
    public JpaTransactionManager createMySQLTxMgmr(@Qualifier("mysqlEMF")EntityManagerFactory factory){
        return new JpaTransactionManager(factory);
    }
}
