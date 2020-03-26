package com.springboot.ljy.web;

import com.springboot.ljy.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
    //@RequestParam은 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션이다.
    // @RequestParam("name")이라는 이름으로 넘긴 파라ㅏ미터를 String name에 저장하는 것
}
