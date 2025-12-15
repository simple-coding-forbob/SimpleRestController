package com.simplecoding.simplerestcontroller.controller.ex04;

import com.simplecoding.simplerestcontroller.vo.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
public class ObjectController {
//	따라하기 예제 1
    @PostMapping("/ex04/example01")
    public void example01(
            @RequestBody Member member
    ) {
        log.debug(member);
    }

    //	따라하기 예제 2
    @PutMapping("/ex04/example02/{id}")
    public void example02(
            @PathVariable String id,
            @RequestBody Member member
    ) {
        log.debug(member);
    }

    //	따라하기 예제 3
    @DeleteMapping("/ex04/example03/{id}")
    public void example03(
            @PathVariable String id
    ) {
        log.debug(id);
    }
}