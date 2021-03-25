package com.sports.cricket.dao;

import java.util.List;

import com.sports.cricket.entity.CricketStatastics;

public interface ICricketStatasticsDAO {

	public List<CricketStatastics> findAll();

	public CricketStatastics findByID(int id);

	public void addPlayerStatastics(CricketStatastics cricketStatastics);

	public void deletePlayerStatastics(int id);

}
