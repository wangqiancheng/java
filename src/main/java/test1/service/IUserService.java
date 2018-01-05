package test1.service;

import test1.domain.User;

/**  
* <p>Title: IUserService</p>  
* <p>Description: </p>  
* @author wqc  
* @date 2018年1月4日  
*/  
public interface IUserService {
	public abstract User getUserById(int userId);
}
