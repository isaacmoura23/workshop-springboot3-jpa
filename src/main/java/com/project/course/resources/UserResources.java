package com.project.course.resources;

import com.project.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findall(){
        User user = new User(1L, "ayla", "aykamoura@gmail.com", "999999", "12345");
        return ResponseEntity.ok().body(user);
    }

}
