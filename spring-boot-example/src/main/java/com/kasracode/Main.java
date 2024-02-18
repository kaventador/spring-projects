package com.kasracode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

//@SpringBootApplication
@SpringBootApplication
@RestController
@RequestMapping("api/v1/customer")
public class Main {
    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args){
        SpringApplication.run(Main.class,args);

    }

    @GetMapping
    public List<Customer> getCustomer(){
        return customerRepository.findAll();
    }

    record NewCustomerRequest (
            String name,
            String email,
            Integer age
    ){

    }
    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request){
        Customer custumer = new Customer();
        custumer.setName(request.name());
        custumer.setEmail(request.email());
        custumer.setAge(request.age());
        customerRepository.save(custumer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer (@PathVariable("customerId") Integer id){
        customerRepository.deleteById(id);
    }
//    @PutMapping("{customerId}")
//    public void updateCustomer (@PathVariable("customerId") Integer id){
//        customerRepository.deleteById(id);
//    }



//    @GetMapping("/greet")
//    public GreetResponse greet(){
//        GreetResponse response = new GreetResponse(
//                "Hello",
//                List.of("Java","Golang","JavaScript"),
//                new Person("kasra",25,30_000)
//        );
//        return response;
//    }
//
//    record Person(String name , int age , double savings){
//
//    }
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguages,
//            Person person
//    ){}

//    class GreetResponse {
//        private final String greet;
//
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(greet);
//        }
//    }


}
