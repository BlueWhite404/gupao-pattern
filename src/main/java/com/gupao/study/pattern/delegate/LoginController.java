package com.gupao.study.pattern.delegate;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date 2019/3/14
 **/
public class LoginController implements IController{

	public void login(){
		System.out.println("登录成功");
	}

}
