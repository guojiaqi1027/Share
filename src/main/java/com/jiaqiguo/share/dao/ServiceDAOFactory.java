package com.jiaqiguo.share.dao;

public class ServiceDAOFactory {
	public static final int CREATE_USER_SERVICE=0;
	public static final int DAO_JDBC=0;
	public ServiceDAO createServiceDAO(int serviceType, int DAOType){
		switch(DAOType){
		case DAO_JDBC:
			return createJDBCServiceDAO(serviceType);
		default:return null;
		}
	}
	private ServiceDAO createJDBCServiceDAO(int serviceType){
		switch(serviceType){
		case CREATE_USER_SERVICE:
			return new CreateUserServiceJdbcDAOImpl();
		default:return null;
		}
		
	}
}
