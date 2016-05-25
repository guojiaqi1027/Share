package com.jiaqiguo.share.model;

import java.awt.Image;
import java.util.ArrayList;
/**
 * Share content posted by users
 * 
 * @author jiaqiguo
 * 
 */

public class Share {
	private String content;
	private ArrayList<Image> imageList;
	private String id;
	private Share(Builder builder){
		this.content=builder.content;
		this.imageList=builder.imageList;
		this.id=builder.Id;
	}
	public static Builder build(){
		return new Builder();
	}
	public static class Builder{
		private String content;
		private ArrayList<Image> imageList;
		private String Id;
		public Builder withId(String id){
			this.Id=id;
			return this;
		}
		public Builder withContent(String content){
			this.content=content;
			return this;	
		}
		public Builder withImageLIst(ArrayList<Image> list){
			this.imageList=list;
			return this;
		}
		public Share create(){
			return new Share(this);
		}
	}
	public String getId(){
		return id;
	}
	public String getContent(){
		return content;
	}
	public ArrayList<Image> getImageList(){
		return imageList;
	}
}
