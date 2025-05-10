//package com.aptitudetestapi.test_app.service;
//
//import com.aptitudetestapi.test_app.model.Users;
//import com.aptitudetestapi.test_app.repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    UserRepo repo;
//
//    @Autowired
//    AuthenticationManager authManager;
//
//    @Autowired
//    JwtService jwtService;
//
//    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
//
//    public Users register(Users users) {
//        users.setPassword(encoder.encode(users.getPassword()));
//        return repo.save(users);
//    }
//
//    public List<Users> getAllUsers() {
//        return repo.findAll();
//    }
//
//    public void deleteUser(int userid) {
//        repo.deleteById(userid);
//    }
//
//
//    public Users updateUser(int userId, Users users) {
//        return repo.findById(userId).map(user -> {
//            user.setUserName(users.getUserName());
//            user.setPassword(encoder.encode(users.getPassword()));
//            return repo.save(user);
//        }).orElse(null);
//    }
//
//
//    public Optional<Users> getUserById(int userId) {
//        return repo.findById(userId);
//    }
//
//    public String verify(Users users) {
//        try {
//            Authentication authentication = authManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            users.getUserName(), // Fixed from `getUserName()`
//                            users.getPassword()
//                    )
//            );
//
//            if (authentication.isAuthenticated()) {
//                return jwtService.generateToken(users.getUserName());
//            }
//        } catch (Exception e) {
//            return "Invalid credentials";
//        }
//        return "Invalid credentials";
//    }
//
//    public String refreshToken(Users users) {
//        return jwtService.generateToken(users.getUserName());
//    }
//}
