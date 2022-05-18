package com.example.demo.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@ConfigurationProperties(prefix = "app.datasource")
public class PostgresDataSource extends HikariConfig {
    @Bean(name = "app.datasource")
    public DataSource hikariDataSource() throws SQLException {
        return new HikariDataSource(this);
    }
}
