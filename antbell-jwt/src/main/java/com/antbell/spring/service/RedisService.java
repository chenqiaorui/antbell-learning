package com.antbell.spring.service;

/**
 * redis操作service
 * 对象和数组都以json形式存储
 * created by rich chen on 2020/01/09
 * */
public interface RedisService {
    /**
     * 存储数据
     * */
     void set(String key, String value);
     /**
      * 获取数据
      * */
     String get(String  key);
     /**
      * 设置超时时间
      * */
     boolean expire(String key, long expire);
     /**
      * 删除数据
      * */
     void remove(String key);
     /**
      * 自增操作
      * @param delta 自增步数
      *
      * */
     Long increment(String key, long delta);
}
