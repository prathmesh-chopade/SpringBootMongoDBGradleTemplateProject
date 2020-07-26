package com.example.demo.service;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.example.demo.model.LegoSet;

@Repository
public interface LegoSetService {

	public void insert(LegoSet legoSet);

	public Collection<LegoSet> all();

	public void update(LegoSet legoSet);

	public void delete(String id);

	public LegoSet searchById(String id);

	public Collection<LegoSet> hardDifficultyThatStartWithLetterM();

	public Collection<LegoSet> byDeliveryFeeLessThanPrice(int price);

	public Collection<LegoSet> byGreatReviews();

	Collection<LegoSet> searchByFieldAndSortData(String theme);

}
