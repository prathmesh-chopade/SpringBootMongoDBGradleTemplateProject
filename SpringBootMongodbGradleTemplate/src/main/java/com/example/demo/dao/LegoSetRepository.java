package com.example.demo.dao;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.LegoSet;
import com.example.demo.model.LegoSetDifficulty;

@Repository
public interface LegoSetRepository extends MongoRepository<LegoSet	, String> {
	
	Collection<LegoSet> findAllByThemeContains(String theme, Sort sort);
	
	Collection<LegoSet> findAllByDifficultyAndNameContains(LegoSetDifficulty difficulty, String name);
	
	@Query("{'delivery.deliveryFee' : {$lt : ?0}}")
	Collection<LegoSet> findAllByDeliveryPriceLessThan(int price);
	
	@Query("{'reviews.rating' : {$eq : 10}}")
	Collection<LegoSet> findAllByGreatReviews();
	
	Collection<LegoSet> findAllBy(TextCriteria textCriteria);

}
