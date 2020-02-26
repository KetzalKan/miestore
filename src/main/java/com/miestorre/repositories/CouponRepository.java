package com.miestorre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miestore.models.Coupon;

@Repository
public interface CouponRepository extends  JpaRepository<Coupon, Long>{

}
