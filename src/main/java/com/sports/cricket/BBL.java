package com.sports.cricket;

import org.springframework.stereotype.Component;

@Component
public class BBL implements League {

	@Override
	public String leagueName() {
		return "BBL";

	}

}
