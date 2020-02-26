package com.miestorre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miestore.models.Item;

@Repository
public interface ItemRepository extends  JpaRepository<Item, Long>{

}
