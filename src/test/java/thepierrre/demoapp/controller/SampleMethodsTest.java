package thepierrre.demoapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SampleMethodsTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHome() {
        String expected = "Welcome to the demo Spring Boot application!";
        String result = this.restTemplate.getForObject("http://localhost:" + port + "/", String.class);
        assertEquals(expected, result);
    }

    @Test
    public void testAdd() {
        int a = 5;
        int b = 3;
        int expected = 8;
        int result = this.restTemplate.getForObject("http://localhost:" + port + "/add?a={a}&b={b}", Integer.class, a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testSubtract() {
        int a = 10;
        int b = 4;
        int expected = 6;
        int result = this.restTemplate.getForObject("http://localhost:" + port + "/subtract?a={a}&b={b}", Integer.class, a, b);
        assertEquals(expected, result);
    }

}