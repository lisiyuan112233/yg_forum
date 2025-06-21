package com.sia.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sia.common")
@MapperScan("com.sia.common.mapper")
public class commonConfig {
}
