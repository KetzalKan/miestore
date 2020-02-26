package com.miestore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miestore.exceptions.ResourceNotFoundException;
import com.miestore.models.Coupon;
import com.miestorre.repositories.CouponRepository;
import com.miestorre.repositories.ItemRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController()
public class CouponController {

	@Autowired
	private CouponRepository couponRepository;
	
	@Autowired
	private ItemRepository itemRepository;

	public CouponController() {
	}
	
	@GetMapping("/coupons")
	public List<Coupon> getCoupon(){
		return (List<Coupon>) couponRepository.findAll();
	}
	
	@PostMapping("/coupons/")
	public Coupon addUser(@RequestParam Long itemId, @RequestBody Coupon coupon) {
		Coupon createdCoupon = itemRepository.findById(itemId)
			.map(item -> {
				coupon.setItem(item);
				return couponRepository.save(coupon);
			}).orElseThrow(() -> new ResourceNotFoundException("Item not found with id " + itemId));
		
		return createdCoupon;
	}
	
}
