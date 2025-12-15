/**
 * 
 */
package com.simplecoding.simplerestcontroller.controller.qz05;

import com.simplecoding.simplerestcontroller.common.ApiResponse;
import com.simplecoding.simplerestcontroller.vo.Dept;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simple-coding
 *
 */
@Log4j2
@RestController
public class Quiz05Controller {
    //	퀴즈 예제 1
    @GetMapping("/qz05/quiz01")
    public ResponseEntity<ApiResponse<List<String>>> quiz01(@RequestParam(defaultValue = "") String dno,
                                                               @RequestParam(defaultValue = "") String dname,
                                                            @RequestParam(defaultValue = "") String loc) {
        List<String> list = new ArrayList<>();
        list.add(dno);
        list.add(dname);
        list.add(loc);

        ApiResponse<List<String>> apiResponse = new ApiResponse<>(list);
        return ResponseEntity.ok(apiResponse);
    }

    //	퀴즈 예제 2
    @PostMapping("/qz05/quiz02")
    public ResponseEntity<Void> quiz02(
            @RequestBody Dept dept
    ) {
        log.debug(dept);
        return ResponseEntity.ok().build();
    }

    //	퀴즈 예제 3
    @PutMapping("/qz05/quiz03/{dno}")
    public ResponseEntity<Void> quiz03(
            @PathVariable String dno,
            @RequestBody Dept dept
    ) {
        log.debug(dept);
        return ResponseEntity.ok().build();
    }

    //	퀴즈 예제 4
    @DeleteMapping("/qz05/quiz04/{dno}")
    public ResponseEntity<Void> quiz04(
            @PathVariable String dno
    ) {
        log.debug(dno);
        return ResponseEntity.ok().build();
    }
}
