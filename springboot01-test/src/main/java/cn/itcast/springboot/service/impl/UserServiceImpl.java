package cn.itcast.springboot.service.impl;

import org.springframework.stereotype.Service;

import cn.itcast.springboot.service.UserService;

/**
 * UserServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年3月7日 下午3:47:21
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public void say() {
		System.out.println("========say=======");
	}

}
