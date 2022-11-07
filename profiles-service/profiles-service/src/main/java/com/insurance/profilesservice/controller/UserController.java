package com.insurance.profilesservice.controller;

import com.insurance.profilesservice.exception.BadProfileException;
import com.insurance.profilesservice.model.User;
import com.insurance.profilesservice.services.UserService;
import com.insurance.profilesservice.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private  final UserServiceImpl userServiceimpl;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserByIdAction(@PathVariable("id") Long id) throws BadProfileException {
        User model = userServiceimpl.getById(id);
//                getById(ahid);
        return model==null? ResponseEntity.notFound().build() : ResponseEntity.ok(model);
    }
    @GetMapping("/{id}/exists")
    public ResponseEntity<Boolean> existsUserByIdAction(@PathVariable("id") Long id) throws BadProfileException {
        return ResponseEntity.ok(userServiceimpl.existsById(id));
    }

    @PostMapping
    public ResponseEntity<User> addAction(@RequestBody User model) throws BadProfileException{
        return new ResponseEntity<User>(userServiceimpl.add(model), HttpStatus.CREATED);
    }


}
