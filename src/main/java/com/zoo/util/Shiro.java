package com.zoo.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.zoo.pojo.User;
import com.zoo.service.UserService;

public class Shiro extends AuthorizingRealm{

	@Resource
	private UserService userService;
	/*
	 * 权限认证  获取登陆用户的权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pincipalCollection) {
		/*String loginUserId = (String)pincipalCollection.fromRealm(getName()).iterator().next();
		User user = userService.getUserById(loginUserId);
		//获取用户的角色名称
		List<String> roleList = new ArrayList<String>(){
			{
				add("1");
			}
		};
		if(user != null){
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			//获取用户的权限
			HashSet<String> se = new HashSet<String>(){
				{
					add("admin");
				}
			};
			info.setRoles(se);
			
			for (String role : roleList) {
				info.addStringPermission(role);
			}
			return info;
		}
		*/
		return null;
	}

	/*
	 * 登陆认证，创建用户的登陆信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		/*UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;  
		
		User user = userService.getUserById(token.getUsername());
		if(user != null){
			//保存用户登录信息到认证中
            return new SimpleAuthenticationInfo(user.getUserId(), user.getPassword(), getName());  
		}*/
		return null;
	}
	
	
}
