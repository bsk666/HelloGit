package com.bsk.demo2;

import com.bsk.demo2.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
 

@SpringBootTest
public class Demo2ApplicationTests {

    @Autowired
    Person person;

    @Test
    public  void contextLoads() {
        System.out.println(person );
    }

}
