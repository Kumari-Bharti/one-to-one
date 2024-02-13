package com.example.one.to.one.unidirectional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long userId;
	private String userName;
	private Integer userAge;
	@OneToOne(cascade = CascadeType.ALL)
	private Passport passport;
	public User(Long userId, String userName, Integer userAge, Passport passport) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.passport = passport;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", passport=" + passport
				+ "]";
	}

}
