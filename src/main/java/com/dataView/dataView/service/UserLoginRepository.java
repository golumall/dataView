package com.dataView.dataView.service;

import com.dataView.dataView.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,Integer> {

    @Query("SELECT l from UserLogin l where l.user_name=:user_name and l.password=:password")
    UserLogin findByUser_nameAndPassword(String user_name,String password);

}
