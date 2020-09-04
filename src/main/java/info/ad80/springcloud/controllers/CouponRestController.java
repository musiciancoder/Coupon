package info.ad80.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import info.ad80.springcloud.model.Coupon;
import info.ad80.springcloud.model.CouponRepo;

@RestController
@RequestMapping
public class CouponRestController {
	
	@Autowired
	CouponRepo repo;
	
	
	@RequestMapping(value = "/coupons", method = RequestMethod.POST)
	public Coupon create (Coupon coupon) {
		return repo.save(coupon);
		}
	
	
	@RequestMapping(value = "/coupons/code", method = RequestMethod.GET)
	public Coupon getCoupon(String code) {
	return repo.findByCode(code);
		
	}

}
