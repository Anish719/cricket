package com.sports.cricket.service;

import java.util.List;

import com.sports.cricket.entity.CricketStatastics;

public interface ICricketStatasticsService {

	public List<CricketStatastics> findAll();

	public CricketStatastics findByID(int id);

	public void addPlayerStatastics(CricketStatastics cricketStatastics);

	public void deletePlayerStatastics(int id);

}
