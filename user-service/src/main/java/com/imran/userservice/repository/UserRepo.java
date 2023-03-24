package com.imran.userservice.repository;

import com.imran.userservice.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDetail,Integer> {
    UserDetail findByUserId(int id);
}
