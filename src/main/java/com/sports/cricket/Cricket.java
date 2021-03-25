package com.sports.cricket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements CommandLineRunner {

	@Autowired
	@Lazy
	private RandomTeamGenerator randomTeamGenerator;

	@Bean
	@Lazy
	private League getLeague() {

		return () -> "T20 Blast";

	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(randomTeamGenerator.generateRandomTeam() + " and playing " + getLeague().leagueName());
	}

}
