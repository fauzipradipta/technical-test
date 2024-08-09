package com.technicaltest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technicaltest.DTO.UserDTO;
import com.technicaltest.Entity.User;
import com.technicaltest.Service.UserService;

@RestController
@RequestMapping("/api/auth")
public class UserController {
	
	 private final UserService userService;

	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @PostMapping("/signup")
	    public ResponseEntity<?> registerUser(@RequestBody UserDTO request) {
	        User user = userService.registerUser(request.getUsername(), request.getPassword());
	        return ResponseEntity.ok(user);
	    }

	    @PostMapping("/signin")
	    public ResponseEntity<?> authenticateUser(@RequestBody UserDTO request) {
	        User user = userService.authenticateUser(request.getUsername(), request.getPassword());
	        if (user != null) {
	            return ResponseEntity.ok("Authentication successful");
	        } else {
	            return ResponseEntity.status(401).body("Invalid credentials");
	        }
	    }

}
