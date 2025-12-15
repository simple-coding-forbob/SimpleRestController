/**
 * 
 */
package com.simplecoding.simplerestcontroller.controller.qz04;

import com.simplecoding.simplerestcontroller.vo.Dept;
import com.simplecoding.simplerestcontroller.vo.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author simple-coding
 *
 */
@Log4j2
@RestController
public class Quiz04Controller {

    //	퀴즈 예제 1
    @PostMapping("/qz04/quiz01")
    public void quiz01(
            @RequestBody Dept dept
    ) {
        log.debug(dept);
    }

    //	퀴즈 예제 2
    @PutMapping("/qz04/quiz02/{id}")
    public void quiz02(
            @PathVariable String id,
            @RequestBody Dept dept
    ) {
        log.debug(dept);
    }

    //	퀴즈 예제 3
    @DeleteMapping("/qz04/quiz03/{dno}")
    public void quiz03(
            @PathVariable String dno
    ) {
        log.debug(dno);
    }
}
