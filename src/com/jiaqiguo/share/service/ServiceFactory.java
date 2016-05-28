package com.jiaqiguo.share.service;

public class ServiceFactory {
	public static int CREATE_USER_SERVICE=0;
	public Service createService(int serviceType){
		switch(serviceType){
		case 0:
			return new CreateUserService();
		default : return null;
		}
	}
	
}
