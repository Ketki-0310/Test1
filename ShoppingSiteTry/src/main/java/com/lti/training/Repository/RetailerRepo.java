package com.lti.training.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.lti.training.entity.Retailer;

@Repository
public class RetailerRepo {

	@PersistenceContext
	private EntityManager entityManager;

	public void add(Retailer retailer) {
		entityManager.persist(retailer);

	}

	public Retailer fetch(int id) {
		return entityManager.find(Retailer.class, id);
	}

	public List<Retailer> fetchAll() {
		Query q = entityManager.createQuery("select obj from Retailer as obj");
		return q.getResultList();
	}

	public void delete(Retailer r) {
					entityManager.remove(r);
	}

}
