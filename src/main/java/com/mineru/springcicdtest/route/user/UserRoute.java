package com.mineru.springcicdtest.route.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserRoute {

    @GetMapping("")
    public ResponseEntity<?> getUsers() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
