package com.sports.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sports.cricket.dao.CricketStatasticsDAO;
import com.sports.cricket.entity.CricketStatastics;

@Service
public class CricketStatasticsService implements ICricketStatasticsService {

	@Autowired
	private CricketStatasticsDAO cricketStatasticsDAO;

	@Override
	@Transactional
	public List<CricketStatastics> findAll() {
		return cricketStatasticsDAO.findAll();
	}

	@Override
	@Transactional
	public CricketStatastics findByID(int id) {
		return cricketStatasticsDAO.findByID(id);
	}

	@Override
	@Transactional
	public void addPlayerStatastics(CricketStatastics cricketStatastics) {
		cricketStatasticsDAO.addPlayerStatastics(cricketStatastics);
	}

	@Override
	@Transactional
	public void deletePlayerStatastics(int id) {
		cricketStatasticsDAO.deletePlayerStatastics(id);
	}

}
