package test1.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test1.domain.User;
import test1.service.IUserService;


/**  
* @ClassName UserController  
* @Description: 
* @author wangqiancheng 
* @date 2018年1月5日 上午11:35:55  
*/  
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService = null;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = userService.getUserById(userId);
		model.addAttribute(user);
		return "showUser";
	}
}
