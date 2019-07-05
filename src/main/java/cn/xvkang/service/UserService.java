package cn.xvkang.service;

import cn.xvkang.dto.UserDto;
import cn.xvkang.primaryentity.UserTable;

public interface UserService {
	UserTable findByUsername(String username);

	UserDto loginFindByUsername(String username);
}
