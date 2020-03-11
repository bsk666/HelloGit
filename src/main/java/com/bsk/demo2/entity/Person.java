package com.bsk.demo2.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
*  将配置文件中配置的每一个属性的值，映射到这个组件中
* @ConfigurationProperties,告诉SpringBoot将本类中所有的属性 和配置文件中相关的配置进行绑定
*       prefix = "person" : 配置文件中的哪个属性和下面的属性进行一一映射
*
*       只有这个组件是容器中的组件，才能使用容器提供的 @ConfigurationProperties功能
*
*
* */

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Date birthday;

    private Map<String,Object> map;
    private List<Object> lists;
    private Dog dog;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public List<Object> getLists() {
        return lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
