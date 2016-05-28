package com.jiaqiguo.share.service;

import com.jiaqiguo.share.dao.CreateUserServiceDAO;
import com.jiaqiguo.share.service.request.ServiceRequest;
import com.jiaqiguo.share.service.response.CreateUserServiceResponse;
import com.jiaqiguo.share.service.response.ServiceResponse;

public class CreateUserService implements Service{
	CreateUserServiceResponse response;
	CreateUserServiceDAO serviceDAO;
	@Override
	public ServiceResponse execute(ServiceRequest request) {
		// TODO Auto-generated method stub
		return response;
	}
}
