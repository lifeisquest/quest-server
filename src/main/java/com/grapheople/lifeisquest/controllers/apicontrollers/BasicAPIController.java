//package com.grapheople.lifeisquest.controllers.apicontrollers;
//
//import com.google.common.collect.Maps;
//
//import com.grapheople.lifeisquest.dao.UserRepository;
//import com.grapheople.lifeisquest.domain.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Map;
//
///**
// * @author Steven Jee
// * @since v.
// */
//@RestController
//public class BasicAPIController {
//
//  @Autowired
//  private UserRepository userRepository;
//
//  @RequestMapping(method = RequestMethod.GET, path = "/api/user/{userId}")
//  public User getUser(@PathVariable long userId){
//    User user = userRepository.findOne(userId);
//    return user;
//  }
//
//  @RequestMapping(method = RequestMethod.GET, path = "/api/put/user/test")
//  public Map<String, Object> setUser(){
//    userRepository.save(new User("magmacannon@gmail.com", "test"));
//    Map<String, Object> resultMap = Maps.newLinkedHashMap();
//    resultMap.put("message", "success");
//    resultMap.put("item", userRepository.findAll());
//    return resultMap;
//  }
//}
