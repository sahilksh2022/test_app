//package com.aptitudetestapi.test_app.service;
//
//import com.aptitudetestapi.test_app.model.Users;
//import com.aptitudetestapi.test_app.repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//
//    @Autowired
//    UserRepo repo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Users users = repo.findByUserName(username);
//
//        if (users == null){
//            System.out.println("User Not Found");
//            throw new UsernameNotFoundException("User Not Found");
//        }
//
////        return new UserPrincipal(users);
//        return new org.springframework.security.core.userdetails.User(
//                users.getUserName(),
//                users.getPassword(),
//                new ArrayList<>()
//        );    }
//}
