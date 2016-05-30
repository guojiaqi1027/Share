package com.jiaqiguo.share.service;

public class ServiceFactory {
	public static final int CREATE_USER_SERVICE=0;
	public static final int QUERY_USER_SHARES=1;
	public Service createService(int serviceType){
		switch(serviceType){
		case CREATE_USER_SERVICE:
			return new CreateUserService();
		default : return null;
		}
	}
	
}
