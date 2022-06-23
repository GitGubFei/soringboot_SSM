package com.itfei;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Soringboot11RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void set() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("age",21);
    }
    @Test
    void get() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
       Object object= valueOperations.get("age");
        System.out.println(object);
    }
    @Test
    void hset() {
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put("info","a","aa21");
    }
    @Test
    void hget() {
        HashOperations hashOperations = redisTemplate.opsForHash();
//        ValueOperations valueOperations = hashOperations;
        Object object= hashOperations.get("info","a");
        System.out.println(object);
    }

}
