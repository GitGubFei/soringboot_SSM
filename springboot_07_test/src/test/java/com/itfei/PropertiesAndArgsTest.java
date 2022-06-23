package com.itfei;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"test.prop=testValue1"},args = {"--test.prop=testValue2"})//临时属性
public class PropertiesAndArgsTest {
    @Value("${test.prop}")
        private String message;
        @Test
        void testProperties(){
            System.out.println(message);
    }
}
