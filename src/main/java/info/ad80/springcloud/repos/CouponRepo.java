package info.ad80.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import info.ad80.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);
	
	

}
