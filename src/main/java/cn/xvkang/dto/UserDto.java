package cn.xvkang.dto;

import java.util.ArrayList;
import java.util.List;

import cn.xvkang.primaryentity.Permission;
import cn.xvkang.primaryentity.Role;
import cn.xvkang.primaryentity.UserTable;
import lombok.Data;

@Data
public class UserDto {

	private UserTable user;
	private List<Role> roless;
	private List<Permission> permissions;

	private List<String> roleCodes = new ArrayList<>();
	private List<String> permissionCodes = new ArrayList<>();

}
