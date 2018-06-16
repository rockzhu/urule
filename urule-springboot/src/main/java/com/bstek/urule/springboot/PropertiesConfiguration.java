package com.bstek.urule.springboot;

import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;

import com.bstek.urule.URulePropertyPlaceholderConfigurer;

import static java.lang.System.setProperties;

/**
 * @author Jacky.gaoß
 * @since 2016年10月12日
 */
//@Component
public class PropertiesConfiguration extends URulePropertyPlaceholderConfigurer implements InitializingBean{
	@Override
	public void afterPropertiesSet() throws Exception {
		Properties props=new Properties();
		props.setProperty("urule.repository.xml", "classpath:mysql.xml");	
		setProperties(props);
	}
}
