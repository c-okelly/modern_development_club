package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @PostMapping("/test")
    @ResponseBody
    public String testEndPoint(@RequestParam(name="name", required=false, defaultValue="Stranger") String name){
        return "Hello " + name;
    }

    @GetMapping("/hello")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }



}