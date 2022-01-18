package com.bs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.bean.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{

}
