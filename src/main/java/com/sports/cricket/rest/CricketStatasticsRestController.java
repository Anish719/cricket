package com.sports.cricket.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sports.cricket.entity.CricketStatastics;
import com.sports.cricket.service.CricketStatasticsService;

@RestController
@RequestMapping("/sports")
public class CricketStatasticsRestController {

	@Autowired
	private CricketStatasticsService cricketStatasticsService;

	@GetMapping(value = "/cricketstatastics", produces = "application/json")
	public List<CricketStatastics> findAll() {
		return cricketStatasticsService.findAll();
	}

	@GetMapping(value = "/cricketstatastics/{id}", produces = "application/json")
	public CricketStatastics findbyID(@PathVariable("id") int id) {
		return cricketStatasticsService.findByID(id);
	}

	@PostMapping(value = "/cricketstatastics", produces = "application/json", consumes = "application/json")
	public CricketStatastics addStatastics(@RequestBody CricketStatastics cricketStatastics) {

		cricketStatasticsService.addPlayerStatastics(cricketStatastics);

		return cricketStatastics;
	}

	@PutMapping(value = "/cricketstatastics", produces = "application/json", consumes = "application/json")
	public CricketStatastics updateStatastics(@RequestBody CricketStatastics cricketStatastics) {

		cricketStatasticsService.addPlayerStatastics(cricketStatastics);

		return cricketStatastics;
	}

	@DeleteMapping(value = "/cricketstatastics/{id}", produces = "application/json")
	public String deleteStatastics(@PathVariable("id") int id) {

		cricketStatasticsService.deletePlayerStatastics(id);

		return "Deleted Statastic with id " + id;
	}

}
