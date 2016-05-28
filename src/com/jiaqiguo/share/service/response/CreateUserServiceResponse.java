package com.jiaqiguo.share.service.response;

import com.jiaqiguo.share.model.User;

public class CreateUserServiceResponse implements ServiceResponse{
	User newCreatedUser;
	public CreateUserServiceResponse(User user){
		this.newCreatedUser=user;
	}
	public User getUser(){
		return newCreatedUser;
	}
}
