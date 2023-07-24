package com.eserciziopt1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationTest {

		@Bean
		@Scope("singleton")
		public TestElement test() {
			return new TestElement("Ciao Mondo!");
		}
	
}
