/**
 * 
 */
package com.profile.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.model.ProfileIntro;
import com.profile.repository.ProfileRepository;
import com.profile.util.Util;

/**
 * @author HP
 *
 */
@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	ProfileRepository repo;
	
	@Override
	public ProfileIntro getProfileIntro() {
		// TODO Auto-generated method stub
		return repo.getProfileIntro();
	}

	@Override
	public BigDecimal getInterest(String principle, String rate, String time) {
		Util util = new Util();
		return util.getInterestFormula(principle, rate, time);
	}
	
	@Override
	public double getSavings(double salePrice, double actualPrice) {
        return (actualPrice - salePrice)*100/actualPrice;
	}

	@Override
	public BigDecimal getSavingsUsingBigDecimal(double salePrice, double actualPrice) {
		BigDecimal ap = new BigDecimal(Double.toString(actualPrice));
		BigDecimal sp = new BigDecimal(Double.toString(salePrice));		
        return ap.subtract(sp).multiply(new BigDecimal(100)).divide(ap,2, RoundingMode.HALF_EVEN);
	}
	
}
