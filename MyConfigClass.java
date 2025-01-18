package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.entity") // id of which package we have to make beans
public class MyConfigClass {
	

}
