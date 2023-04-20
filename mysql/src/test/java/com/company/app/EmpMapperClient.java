package com.company.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.emp.mapper.EmpMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/config/*-context.xml")
@Log4j
public class EmpMapperClient {
	
	@Autowired EmpMapper mapper;
	
	
	@Test
	public void dateTest() {
		log.info(mapper.getAll());
		
	}
	
}
