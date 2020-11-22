package com.snc.redis.controller;


import com.snc.redis.entity.Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/snc/api/redis")
public class TestController {

    @Autowired
    private RedisTemplate<String,Days> redisTemplate;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Days test() {
        Days d = new Days();
        d.setDate("123");
        d.setDaysId("456");
        d.setItemNumber(123);
        d.setOpenId("redis");
        d.setTitle("hello");

        this.redisTemplate.opsForValue().set("testObj",d);
        System.out.println(redisTemplate.opsForValue().get("testObj"));
        return redisTemplate.opsForValue().get("testObj");
    }

}
