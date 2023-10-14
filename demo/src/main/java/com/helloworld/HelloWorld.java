package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//below annotation tells compiler that this is going to be a SpringBoot application
@SpringBootApplication
//Any method within this class with GetMapping, PostMapping, PutMapping, etc. annotations
//they will be exposed as REST endpoints which clients can call
@RestController
public class HelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }
    //In order for us to expose this method as a REST endpoint
    //for clients to use as GET request, we need to use this annotation
    @GetMapping("/greet")   //if we use only "/", it will not be specific about which method we need to display
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse("Hello world",
                List.of("java", "C++", "C", "Python"),
                new Person("Syed Amaan Ali", 22));
        return response;
    }

    record GreetResponse(String greet, List<String> favProgrammingLang, Person person){}
    record Person(String person, int age){}


    //run this project, then go to chrome and type this in URL - "localhost:8080/greet" and search
    //a hello world string should show up
}
