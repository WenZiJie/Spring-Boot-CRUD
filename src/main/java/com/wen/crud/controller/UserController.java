package com.wen.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wen.crud.result.Result;
import com.wen.crud.user.entity.User;
import com.wen.crud.user.service.userService;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	userService uService;
    
    @PostMapping("/login")
    User queryByup(User user) {
    	User result = uService.queryUserByup(user);
    	if (result==null) {
    		return  null;
		}
    	return  result;
	}
    
    @GetMapping("/")
    Result limit(int page,int limit,String id) {
    	if (id==null) id="";
    	Result result= uService.limit(page, limit, id);
		return result;
	}
    
    @PostMapping("/")
    Result addUser(User user) {
    	Result result = uService.insertAll(user);
    	return  result;
    }
    
    
    
    @DeleteMapping("/{deleteIds}")
    Result deleteUser(@PathVariable String deleteIds) {
    	Result result = uService.deleyeUserById(deleteIds);
    	return result;
    }
    
    @PutMapping("/{id}")
    Result updateUser(User user,@PathVariable int id) {
    	Result result = uService.updateUser(user,id);
		return  result;
    }
    

    @PutMapping("/{id}/{field}")
    Result updateUserByName(@PathVariable int id,@PathVariable String field,String value) {
    	Result result = uService.updateUserByName(id,field,value);
		return  result;
    }
    
}
