package com.example.demo.controller;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LegoSet;
import com.example.demo.service.LegoSetService;

@RestController
public class LegoStoreController {

	@Autowired
	private LegoSetService legoSetService;

	//to insert data into MongoDB
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insert(@RequestBody LegoSet legoSet) {
		System.out.println(legoSet);
		this.legoSetService.insert(legoSet);
	}

	//to fetch all data from MongoDb
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Collection<LegoSet> all() {
		return this.legoSetService.all();
	}

	//	to update stored mongoDB data
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody LegoSet legoSet) {
		this.legoSetService.update(legoSet);
	}

	//to delete perticular data from mongoDB	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		this.legoSetService.delete(id);
	}

	//to fetch data by id value
	@RequestMapping(value = "/byid/{id}", method = RequestMethod.GET)
	public LegoSet searchById(@PathVariable String id) {
		return this.legoSetService.searchById(id);
	}

	//to fetch data by field value
	@RequestMapping(value = "/byfield/{theme}", method = RequestMethod.GET)
	public Collection<LegoSet> searchByField(@PathVariable String theme) {
		return this.legoSetService.searchByFieldAndSortData(theme);
	}

	//to fetch data by more than one field
	@RequestMapping(value = "/bymanyfield", method = RequestMethod.GET)
	public Collection<LegoSet> hardDifficultyThatStartWithLetterM() {
		return this.legoSetService.hardDifficultyThatStartWithLetterM();
	}

	//to fetch data less that parameter price 
	@RequestMapping(value = "/byDeliveryFeeLessThan/{price}", method = RequestMethod.GET)
	public Collection<LegoSet> byDeliveryFeeLessThanPrice(@PathVariable int price) {
		return this.legoSetService.byDeliveryFeeLessThanPrice(price);
	}

	//to get all customers with 10 reviews
	@RequestMapping(value = "/byGreatReviews", method = RequestMethod.GET)
	public Collection<LegoSet> byGreatReviews() {
		return this.legoSetService.byGreatReviews();
	}


}
