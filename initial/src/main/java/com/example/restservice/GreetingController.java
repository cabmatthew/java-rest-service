package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTful web service controller.
 * Doesn't do server-side rendering of data to HTML.
 * It populates and returns a Greeting object. 
 * Gets written to HTTP response as JSON.
 * 
 * This annotation marks the class as a controller. 
 * Every method returns domain object, not a view.
 * It's shorthand for both @Controller and @ResponseBody
 * 
 * Greeting object needs to be converted to JSON. 
 * Spring has 'MappingJackson2HttpMessageConverter'. Converts automatically.
 */
@RestController
public class GreetingController {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * @GetMapping ensures that GET reqs to '/greeting' 
     * go to greeting() method
     * 
     * @RequestParam: Binds 'name' into name parameter of greeting()
     * Default value is set to 'World'
     * 
     * Method creates & returns a new Greeting object.
     * Increments counter, passes it into Greeting object.
     * Formats name using template and 'name' 
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}