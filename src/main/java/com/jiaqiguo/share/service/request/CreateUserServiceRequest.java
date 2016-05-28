package com.jiaqiguo.share.service.request;

import com.jiaqiguo.share.model.User;

public class CreateUserServiceRequest implements ServiceRequest{
	User user;
	public CreateUserServiceRequest(User user){
		this.user=user;
	}
}
