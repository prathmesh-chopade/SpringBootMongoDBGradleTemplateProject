package com.example.demo.model;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import java.time.LocalDate;

public class DeliveryInfo {

	private LocalDate deliveryDate;
	private int deliveryFee;
	private boolean inStock;

	public DeliveryInfo(LocalDate deliveryDate, int deliveryFee, boolean inStock) {
		super();
		this.deliveryDate = deliveryDate;
		this.deliveryFee = deliveryFee;
		this.inStock = inStock;
	}

	public DeliveryInfo() {
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

}
