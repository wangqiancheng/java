package test1.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import test1.IDao.UserMapper;
import test1.domain.User;
import test1.service.IUserService;


/**  
* <p>Title: UserServiceImpl</p>  
* <p>Description: </p>  
* @author wqc  
* @date 2018年1月4日  
*/  

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserMapper userdao;
	
	public User getUserById(int userId) {
		return this.userdao.selectByPrimaryKey(userId);
	}

}
