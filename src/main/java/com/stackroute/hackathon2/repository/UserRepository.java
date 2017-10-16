package com.stackroute.hackathon2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.hackathon2.domain.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer>
{
    
}

