//package com.aptitudetestapi.test_app.controller;
//
//import com.aptitudetestapi.test_app.LoginResponse;
//import com.aptitudetestapi.test_app.model.Users;
//import com.aptitudetestapi.test_app.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class UserController {
//
//    @Autowired
//    UserService service;
//
//    @PostMapping("/register")
//    public ResponseEntity<Users> register(@RequestBody Users users){
////        return service.register(users);
//        Users newUser = service.register(users);
//        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<List<Users>> getAllUsers() {
//        return ResponseEntity.ok(service.getAllUsers());
//    }
//
//    @DeleteMapping("/users/{userid}")
//    public ResponseEntity<Void> deleteUser(@PathVariable int userid){
//        service.deleteUser(userid);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PutMapping("/users/{userId}")
//    public ResponseEntity<Users> updateUser(@PathVariable int userId, @RequestBody Users users){
//        Users updatedUser = service.updateUser(userId,users);
//        return updatedUser != null ? ResponseEntity.ok(updatedUser) : ResponseEntity.notFound().build();
//
//    }
//
//    @GetMapping("/users/{userId}")
//    public ResponseEntity<Users> getUserById(@PathVariable int userId){
//        Optional<Users> user = service.getUserById(userId);
//        return user.map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping("/api/login")
//    public ResponseEntity<?> login(@RequestBody Users users){
//        System.out.println("Login request received: " + users.getUserName() + " - " + users.getPassword());
//
//        String token = service.verify(users);
//
//        if (!token.equals("Invalid credentials")) {
//            return ResponseEntity.ok(new LoginResponse(token));
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//        }
//    }
//
//}
