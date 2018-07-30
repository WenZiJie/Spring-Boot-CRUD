package com.wen.crud.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wen.crud.result.Result;
import com.wen.crud.user.entity.User;
@FeignClient(name = "CRUDSERVICE",fallback = userServiceImpl.class)
public interface userService {
	@RequestMapping(method = RequestMethod.GET, value = "/user/") //因为是调用必须明确告诉是GET方式传入的参数是id
	public Result limit(@RequestParam("page") int page,@RequestParam("limit") int limit,@RequestParam("id") String id);
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/login")
	public User queryUserByup(@RequestBody User user);
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/")
	public Result insertAll(@RequestBody User user);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{deleteIds}")
	public Result deleyeUserById(@PathVariable("deleteIds") String userIds);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
	public Result updateUser(@RequestBody User user,@PathVariable("id") int id);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/user/{id}/{field}")
	public Result updateUserByName(@PathVariable("id") int id,@PathVariable("field") String field,@RequestParam("value") String value);
}
@Component
class userServiceImpl implements userService{

	public Result limit(int page, int limit, String id) {
		return new Result(0, "访问人数过多！请稍后再来...", 0, null);
	}

	public User queryUserByup(User user) {
		return null;
	}

	public Result insertAll(User user) {
		return new Result(0, "访问人数过多！请稍后再来...", 0, null);
	}

	public Result deleyeUserById(String userIds) {
		return new Result(0, "访问人数过多！请稍后再来...", 0, null);
	}

	public Result updateUser(User user, int id) {
		return new Result(0, "访问人数过多！请稍后再来...", 0, null);
	}

	public Result updateUserByName(int id, String field, String value) {
		return new Result(0, "访问人数过多！请稍后再来...", 0, null);
	}
	
}
