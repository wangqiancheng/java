package testMyBatis;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import test1.domain.User;
import test1.service.IUserService;

/**  
* <p>Title: TestMyBatis</p>  
* <p>Description: </p>  
* @author wqc  
* @date 2018年1月4日  
*/  

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
//	private ApplicationContext ac = null;
	@Resource
	IUserService userService = null;
	
//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}
	
	@Test
	public void test() {
		User user = userService.getUserById(1);
		System.out.println("console:" + user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
}
