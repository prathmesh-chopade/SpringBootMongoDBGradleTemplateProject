package com.example.demo.service.impl;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LegoSetDao;
import com.example.demo.model.LegoSet;
import com.example.demo.service.LegoSetService;

@Service
public class LegoSetServiceImpl implements LegoSetService {

	@Autowired
	private LegoSetDao legoSetDao;

	@Override
	public void insert(LegoSet legoSet) {
		this.legoSetDao.insert(legoSet);
	}

	@Override
	public Collection<LegoSet> all() {
		return this.legoSetDao.all();
	}

	@Override
	public void update(LegoSet legoSet) {
		this.legoSetDao.update(legoSet);
	}

	@Override
	public void delete(String id) {
		this.legoSetDao.delete(id);
	}

	@Override
	public LegoSet searchById(String id) {
		return this.legoSetDao.searchById(id);
	}

	@Override
	public Collection<LegoSet> searchByFieldAndSortData(String theme) {
		return this.legoSetDao.searchByFieldAndSortData(theme);
	}

	@Override
	public Collection<LegoSet> hardDifficultyThatStartWithLetterM() {
		return this.legoSetDao.hardDifficultyThatStartWithLetterM();
	}

	@Override
	public Collection<LegoSet> byDeliveryFeeLessThanPrice(int price) {
		return this.legoSetDao.byDeliveryFeeLessThanPrice(price);
	}

	@Override
	public Collection<LegoSet> byGreatReviews() {
		return this.legoSetDao.byGreatReviews();
	}

}
