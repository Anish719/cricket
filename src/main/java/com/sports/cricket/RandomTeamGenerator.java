package com.sports.cricket;

import java.util.List;
import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class RandomTeamGenerator {

	public RandomTeamGenerator() {
		
		System.out.println("Random Generator Called...");
	}
	
	public String generateRandomTeam() {

		var names = List.of("CSK", "RCB", "MI", "PBKS", "KKR", "RR", "SRH", "DC");

		var r = new Random();
		int i = r.nextInt(names.size());

		return names.get(i);

	}

}
