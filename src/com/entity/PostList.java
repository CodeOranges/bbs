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
public class PostList {

	int postId,userId;
	String topic,matter,postTime;
	Set<PostComment> postC=new HashSet<PostComment>();
	@OneToMany(targetEntity=PostComment.class,mappedBy="postId",cascade=CascadeType.ALL)
	public Set<PostComment> getPostC() {
		return postC;
	}
	public void setPostC(Set<PostComment> postC) {
		this.postC = postC;
	}
	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	@Column
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	@Column
	public String getMatter() {
		return matter;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	@Column
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	
}
