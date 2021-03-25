package com.sports.cricket;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class IPL implements League {

	@Override
	public String leagueName() {
		return "IPL";

	}

}
