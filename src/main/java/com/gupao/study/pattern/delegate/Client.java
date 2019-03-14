package com.gupao.study.pattern.delegate;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date 2019/3/14
 **/
public class Client {

	//请求发送者
	public void sendRequest(String request){
		DispatcherRequest dis = new DispatcherRequest(request);
		dis.dispatch();
	}
}
