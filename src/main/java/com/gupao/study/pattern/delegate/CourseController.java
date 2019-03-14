package com.gupao.study.pattern.delegate;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date 2019/3/14
 **/
public class CourseController implements IController{

	public void studyCourse(){
		System.out.println("开始咕泡学习");
	}
}
