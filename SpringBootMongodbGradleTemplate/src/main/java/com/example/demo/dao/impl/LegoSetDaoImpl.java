package com.example.demo.dao.impl;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Component;

import com.example.demo.dao.LegoSetDao;
import com.example.demo.dao.LegoSetRepository;
import com.example.demo.model.LegoSet;
import com.example.demo.model.LegoSetDifficulty;

@Component
public class LegoSetDaoImpl implements LegoSetDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private LegoSetRepository legoSetRepository;

	@Override
	public void insert(LegoSet legoSet) {
		this.mongoTemplate.insert(legoSet);
//		this.legoSetRepository.insert(legoSet);
		
	}

	@Override
	public Collection<LegoSet> all() {
//		return this.mongoTemplate.findAll(LegoSet.class);
		return this.legoSetRepository.findAll();
	}

	@Override
	public void update(LegoSet legoSet) {
//		this.mongoTemplate.save(legoSet);
		this.legoSetRepository.save(legoSet);
	}

	@Override
	public void delete(String id) {
//		this.mongoTemplate.remove(new Query(Criteria.where("id").is(id)), LegoSet.class);
		this.legoSetRepository.deleteById(id);
	}

	@Override
	public LegoSet searchById(String id) {
		return this.legoSetRepository.findById(id).orElse(null);
	}

	@Override
	public Collection<LegoSet> searchByFieldAndSortData(String theme) {
		Sort sortByTheme = Sort.by("theme").ascending();
		return this.legoSetRepository.findAllByThemeContains(theme, sortByTheme);
	}

	@Override
	public Collection<LegoSet> hardDifficultyThatStartWithLetterM() {
		return this.legoSetRepository.findAllByDifficultyAndNameContains(LegoSetDifficulty.HARD, "M");
	}

	@Override
	public Collection<LegoSet> byDeliveryFeeLessThanPrice(int price) {
		return this.legoSetRepository.findAllByDeliveryPriceLessThan(price);
	}

	@Override
	public Collection<LegoSet> byGreatReviews() {
		return this.legoSetRepository.findAllByGreatReviews();
	}


}
