package com.lti.training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.Repository.RetailerRepo;
import com.lti.training.entity.Retailer;


@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class DaoTestAdmin {

		@Autowired
		private RetailerRepo retailerRepo;
		
		@Test
		@Transactional
		public void addRetailer() {
			Retailer movie = new Retailer();
			movie.setName("Titanic");
			
		
		}

	}

	

