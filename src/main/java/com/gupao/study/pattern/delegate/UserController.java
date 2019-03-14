package com.gupao.study.pattern.delegate;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date 2019/3/14
 **/
public class UserController implements IController{

	public void addUser(){
		System.out.println("添加user成功");
	}

}
