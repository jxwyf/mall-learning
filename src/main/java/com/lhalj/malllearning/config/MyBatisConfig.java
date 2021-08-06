package com.lhalj.malllearning.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:MyBatis配置类
 * 用于配置需要动态生成的mapper接口的路径
 */
@Configuration
@MapperScan("com.lhalj.malllearning.mbg.mapper")
public class MyBatisConfig {
}
