package com.example.demo.model;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "legosets")
public class LegoSet {

	@Id
	private String id;
	@TextIndexed
	private String name;
	private LegoSetDifficulty difficulty;
	@TextIndexed
	@Indexed(direction = IndexDirection.ASCENDING)
	private String theme;
	private Collection<ProductReview> reviews = new ArrayList<>();
	private DeliveryInfo deliveryInfo;
	private int nbParts;

	public LegoSet() {
	}
	@PersistenceConstructor 
	public LegoSet(String name, String theme, LegoSetDifficulty difficulty, DeliveryInfo deliveryInfo,
			Collection<ProductReview> reviews) {
		this.name = name;
		this.theme = theme;
		this.difficulty = difficulty;
		this.deliveryInfo = deliveryInfo;
		if (reviews != null) {
			this.reviews = reviews;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LegoSetDifficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(LegoSetDifficulty difficulty) {
		this.difficulty = difficulty;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Collection<ProductReview> getReviews() {
		return reviews;
	}

	public void setReviews(Collection<ProductReview> reviews) {
		this.reviews = reviews;
	}

	public DeliveryInfo getDeliveryInfo() {
		return deliveryInfo;
	}

	public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public int getNbParts() {
		return nbParts;
	}

	public void setNbParts(int nbParts) {
		this.nbParts = nbParts;
	}
	
	@Override
	public String toString() {
		return "LegoSet [id=" + id + ", name=" + name + ", difficulty=" + difficulty + ", theme=" + theme + ", reviews="
				+ reviews + ", deliveryInfo=" + deliveryInfo + ", nbParts=" + nbParts + "]";
	}

}
