package com.profile.service;

import java.math.BigDecimal;

import com.profile.model.ProfileIntro;

public interface ProfileService {

	ProfileIntro getProfileIntro();

	BigDecimal getInterest(String principle, String rate, String time);

	double getSavings(double discountPercentage, double actualRate);

	BigDecimal getSavingsUsingBigDecimal(double salePrice, double actualPrice);

}
