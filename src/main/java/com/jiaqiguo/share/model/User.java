package com.jiaqiguo.share.model;

import java.awt.Image;
/**
 * 
 * @author jiaqiguo
 *
 */
public class User {
	private String id;
	private String nickName;
	private String phoneNumber;
	private String email;
	private String gender;
	private Image profilePicture;
	private User(Builder builder){
		this.id=builder.id;
		this.phoneNumber=builder.phoneNumber;
		this.nickName=builder.nickName;
		this.email=builder.email;
		this.gender=builder.gender;
		this.profilePicture=builder.profilePicture;
	}
	public static Builder build(){
		return new Builder();
	}
	public static class Builder{
		private String id;
		private String nickName;
		private String phoneNumber;
		private String email;
		private String gender;
		private Image profilePicture;
		public Builder withId(String id){
			this.id=id;
			return this;
		}
		public Builder withNickName(String nickName){
			this.nickName=nickName;
			return this;
		}
		public Builder withEmail(String Email){
			this.email=Email;
			return this;
		}
		public Builder withGender(String gender){
			this.gender=gender;
			return this;
		}
		public Builder withProfilePicture(String nickName){
			this.nickName=nickName;
			return this;
		}
		public User create(){
			return new User(this);
		}
	}
	public String getId(){
		return id;
	}
	public String getNickName(){
		return nickName;
	}
	public String getGender(){
		return gender;
	}
	public String getEmail(){
		return email;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public Image getProfilePicture(){
		return profilePicture;
	}
	public void setNickName(String nickName){
		this.nickName=nickName;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public void setProfilePicture(Image profilePicture){
		this.profilePicture=profilePicture;
	}
}
