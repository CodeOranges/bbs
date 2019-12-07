package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class PointsDetail {
	int pdId,userId,postCounts,postComments,sumPoints;
	@Column
	public int getSumPoints() {
		return sumPoints;
	}

	public void setSumPoints(int sumPoints) {
		this.sumPoints = sumPoints;
	}

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getPdId() {
		return pdId;
	}

	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	@Column
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
@Column
	public int getPostCounts() {
		return postCounts;
	}

	public void setPostCounts(int postCounts) {
		this.postCounts = postCounts;
	}
@Column
	public int getPostComments() {
		return postComments;
	}

	public void setPostComments(int postComments) {
		this.postComments = postComments;
	}
	
}
