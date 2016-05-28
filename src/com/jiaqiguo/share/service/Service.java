package com.jiaqiguo.share.service;

import com.jiaqiguo.share.service.request.ServiceRequest;
import com.jiaqiguo.share.service.response.ServiceResponse;

public interface Service {
	public ServiceResponse execute(ServiceRequest request);
}
