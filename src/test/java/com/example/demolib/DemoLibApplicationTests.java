package com.example.demolib;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
class DemoLibApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    void testAdd() {
        assert SimpleMath.add(1, 1) == 2;
    }
}
