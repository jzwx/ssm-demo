package com.wangxin.demo.service.impl;

import javax.annotation.Resource;

import com.wangxin.demo.dao.IUserDao;
import com.wangxin.demo.model.User;
import com.wangxin.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class IUserServiceImpl  implements IUserService {

	@Autowired
	public IUserDao udao;
	
	@Override
	public User getUserById(int id) {
		return udao.selectByPrimaryKey(id);
	}

}
