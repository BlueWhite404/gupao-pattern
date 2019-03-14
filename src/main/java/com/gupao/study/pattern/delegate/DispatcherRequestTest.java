package com.gupao.study.pattern.delegate;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date 2019/3/14
 **/
public class DispatcherRequestTest {

	public static void main(String[] args) {
		Client client = new Client();
		client.sendRequest("login");
		client.sendRequest("user");
		client.sendRequest("course");
	}
}
