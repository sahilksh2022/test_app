package com.aptitudetestapi.test_app.repo;

import com.aptitudetestapi.test_app.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByUserName(String username);
//    Users findByEmail(String email);
}
