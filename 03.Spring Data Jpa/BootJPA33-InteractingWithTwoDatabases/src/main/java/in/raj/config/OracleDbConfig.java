package in.raj.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "in.raj.repository.prod",entityManagerFactoryRef = "oraEMF",transactionManagerRef = "oraTxMgmr")
public class OracleDbConfig {
    //TODO:- Datasource Object
    @Bean("oraDs")
    @ConfigurationProperties(prefix = "ora.ds")
    @Primary
    public DataSource createOracleDataSource() {
        return DataSourceBuilder.create().build();
    }
    //TODO:- LocalContainerEntityManagerFactoryBean that gives EntityManagerFactory object
    @Bean("oraEMF")
    @Primary
    public LocalContainerEntityManagerFactoryBean createLCEMFBForOracle(EntityManagerFactoryBuilder builder) {
        //TODO:- Prepare HB Properties
        Map<String, String> map = new HashMap<String, String>();
        map.put("hibernate.dialect","org.hibernate.dialect.OracleDialect");
        map.put("hibernate.hbm2ddl.auto","update");
        map.put("hibernate.show_sql","true");
        map.put("hibernate.format_sql","true");
        //TODO:- Create LocalContainerEntityManagerFactoryBean class obj using  EntityManagerFactoryBuilder object
        return builder.dataSource(createOracleDataSource()).packages("in.raj.entity.prod").properties(map).build();
    }

    @Bean("oraTxMgmr")
    @Primary
    public JpaTransactionManager createTxMgmrForOracle(@Qualifier("oraEMF") EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }

}
