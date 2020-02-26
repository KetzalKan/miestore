package com.miestorre.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miestore.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
