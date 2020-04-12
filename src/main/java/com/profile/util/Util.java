package com.profile.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Util {

	public BigDecimal getInterestFormula(String principle, String rate, String time) {
		// TODO Auto-generated method stub
		BigDecimal p = new BigDecimal(principle);
		BigDecimal r = new BigDecimal(rate);
		BigDecimal t = new BigDecimal(time);
		
		BigDecimal i = p.multiply(r).multiply(t).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_EVEN);
		
		return i;
	}

	
	
}
