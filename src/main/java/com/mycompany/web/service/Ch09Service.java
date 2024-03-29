package com.mycompany.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.web.dao.Ch09Dao;

@Service
public class Ch09Service {
	private static final Logger logger = LoggerFactory.getLogger(Ch09Service.class);
	
	// Ch09Dao 없이는 객체를 생성할 수 없다, 즉 의존한다.
	@Autowired
	private Ch09Dao ch09Dao;
	
	public void method1() {
		logger.debug("실행");
		ch09Dao.insert();
	}

}
