package com.gupao.study.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date 2019/3/14
 **/
public class DispatcherRequest {

	private String request;

	public DispatcherRequest(String request){
		this.request = request;
	}

	private static final Map<String,Class<?>> map = new HashMap<String, Class<?>>();

	static {
		map.put("login",LoginController.class);
		map.put("user",UserController.class);
		map.put("course",CourseController.class);
	}

	//派发请求
	public void dispatch(){
		if(!map.containsKey(request)){
			throw new RuntimeException("404 NOT FOUND!!!");
		}
		try {
			if ("login".equals(request)) {
				LoginController login = (LoginController) map.get(request).newInstance();
				login.login();
			}else if("user".equals(request)){
				UserController user = (UserController) map.get(request).newInstance();
				user.addUser();
			}else if("course".equals(request)){
				CourseController course = (CourseController) map.get(request).newInstance();
				course.studyCourse();
			}else{
				throw new RuntimeException("404 NOT FOUND!!!");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
