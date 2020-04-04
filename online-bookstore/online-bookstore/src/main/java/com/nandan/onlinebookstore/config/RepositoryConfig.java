package com.nandan.onlinebookstore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
	
	@Autowired
	private EntityManager entityManger;
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(entityManger.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
	}

}
