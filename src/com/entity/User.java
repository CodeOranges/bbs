package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table
public class User {

	int userId;
	String userName,userPass,userEmail,userNickName,userBirthday,sex;
	Set<PostList> postList=new HashSet<PostList>();
	Set<PostComment> postC=new HashSet<PostComment>();
	Set<Points> points=new HashSet<Points>();
	Set<PointsDetail> pd=new HashSet<PointsDetail>();
	@OneToMany(targetEntity=PointsDetail.class,mappedBy="userId",cascade=CascadeType.ALL)
	public Set<PointsDetail> getPd() {
		return pd;
	}
	public void setPd(Set<PointsDetail> pd) {
		this.pd = pd;
	}
	@OneToMany(targetEntity=Points.class,mappedBy="userId",cascade=CascadeType.ALL)
	public Set<Points> getPoints() {
		return points;
	}
	public void setPoints(Set<Points> points) {
		this.points = points;
	}
	@OneToMany(targetEntity=PostComment.class,mappedBy="userId",cascade=CascadeType.ALL)
	public Set<PostComment> getPostC() {
		return postC;
	}
	public void setPostC(Set<PostComment> postC) {
		this.postC = postC;
	}
	@OneToMany(targetEntity=PostList.class,mappedBy="userId",cascade=CascadeType.ALL)
	public Set<PostList> getPostList() {
		return postList;
	}
	public void setPostList(Set<PostList> postList) {
		this.postList = postList;
	}
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	@Column
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Column
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	@Column
	public String getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}
	@Column
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
