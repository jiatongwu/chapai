package cn.xvkang.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import cn.xvkang.primaryentity.Permission;
import cn.xvkang.primaryentity.Role;
import cn.xvkang.primaryentity.UserTable;

public class MyUserDetails extends org.springframework.security.core.userdetails.User {
	private static final long serialVersionUID = 3873089769230883631L;

	private List<Role> roles = new ArrayList<>();
	private List<Permission> permissions = new ArrayList<>();
	private List<String> roleCodes = new ArrayList<>();
	private List<String> permissionCodes = new ArrayList<>();

	public MyUserDetails(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	private UserTable mySystemUser;

	public UserTable getMySystemUser() {
		return mySystemUser;
	}

	public void setMySystemUser(UserTable mySystemUser) {
		this.mySystemUser = mySystemUser;
	}

	public List<String> getRoleCodes() {
		return roleCodes;
	}

	public void setRoleCodes(List<String> roleCodes) {
		this.roleCodes = roleCodes;
	}

	public List<String> getPermissionCodes() {
		return permissionCodes;
	}

	public void setPermissionCodes(List<String> permissionCodes) {
		this.permissionCodes = permissionCodes;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return this.getUsername();
	}

	@Override
	public int hashCode() {
		return getUsername().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
	}

}
