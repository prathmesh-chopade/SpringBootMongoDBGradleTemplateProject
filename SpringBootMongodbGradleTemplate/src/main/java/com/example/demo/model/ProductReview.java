package com.example.demo.model;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import org.springframework.data.mongodb.core.index.TextIndexed;

public class ProductReview {

	@TextIndexed
	private String userName;
	private int rating;

	public ProductReview(String userName, int rating) {
		super();
		this.userName = userName;
		this.rating = rating;
	}

	public ProductReview() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
