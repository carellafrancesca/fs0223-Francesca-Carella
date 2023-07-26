package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.models.ElementList;

@Configuration
public class MenuListConfiguration {

	@Bean("elementlistBean")
	@Scope("singleton")
	public ElementList createElementList() {
		return new ElementList();
	}
	
}
