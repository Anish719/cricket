package com.sports.cricket.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sports.cricket.entity.CricketStatastics;

@Repository
public class CricketStatasticsDAO implements ICricketStatasticsDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<CricketStatastics> findAll() {

		List<CricketStatastics> cricketStatasticsList = new ArrayList<CricketStatastics>();

		try {

			Session session = entityManager.unwrap(Session.class);

			Query<CricketStatastics> query = session.createQuery("from CricketStatastics", CricketStatastics.class);

			cricketStatasticsList = query.getResultList();

		} catch (Exception e) {
			System.out.println("Exception occured while fetching All cricket statastics.." + e.getMessage());
		}

		return cricketStatasticsList;
	}

	@Override
	public CricketStatastics findByID(int id) {

		CricketStatastics cricketStatastics = null;

		try {

			Session session = entityManager.unwrap(Session.class);

			cricketStatastics = session.get(CricketStatastics.class, id);

		} catch (Exception e) {
			System.out.println("Exception occured while cricket statastics for player with ID " + id + e.getMessage());
		}

		return cricketStatastics;
	}

	@Override
	public void addPlayerStatastics(CricketStatastics cricketStatastics) {

		try {

			Session session = entityManager.unwrap(Session.class);

			session.saveOrUpdate(cricketStatastics);

		} catch (Exception e) {
			System.out.println("Exception occured adding player statastics " + e.getMessage());
		}

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void deletePlayerStatastics(int id) {

		try {

			Session session = entityManager.unwrap(Session.class);

			Query query = session.createQuery("delete from CricketStatastics where id= :theID");
			query.setParameter("theID", id);

			query.executeUpdate();

		} catch (Exception e) {
			System.out.println(
					"Exception occured while deleting cricket statastics for player with ID " + id + e.getMessage());
		}

	}

}
