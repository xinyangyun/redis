package com.snc.redis.config;

import com.snc.redis.entity.Days;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author admin
 * @version 1.0.0
 * @createTime 2020年11月22日 15:11:00
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String,Days> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String,Days> template = new RedisTemplate<>();
        //关联
        template.setConnectionFactory(factory);
        //设置Key的序列化器
        template.setKeySerializer(new StringRedisSerializer());
        //设置value的序列化器
        template.setValueSerializer(new Jackson2JsonRedisSerializer<>(Days.class));
        return template;
    }

}
