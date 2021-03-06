package com.ehootu.user.service;

import com.ehootu.core.feature.orm.mybatis.Page;
import com.ehootu.core.generic.GenericService;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.User;
import com.ehootu.user.model.UserExample;

import java.util.List;

/**
 * 用户 业务 接口
 * 
 *
 * @since 2014年7月5日 上午11:53:33
 **/
public interface UserService extends GenericService<User, Integer> {

    /**
     * 用户验证
     * 
     * @param personInfo
     * @return
     */
	User authentication(User personInfo);
	
	/**
	 * 微信服务号用户登录
	 * @param user
	 * @return
	 */
	User login(User user);


    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
	User selectByUsername(String username);

    /**
     * 用户列表页
     * @return
     */
	Page<User> selectByExampleAndPage(Page<User> page, UserExample example);

	/**
	 * 查询用户信息
	 * @param user
	 * @return
	 */
	List<User> findUser(User user);
	/**
	 * 查询用户
	 * @param example
	 * @return
	 */
	User selectByExample(UserExample example);

	Police policeLogin(Police police);
	/**
	 * 根据警察id查询警察名称
	 */
	String findPoliceNameById(String ids);

}
