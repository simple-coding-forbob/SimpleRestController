package com.simplecoding.simplerestcontroller.controller.ex05;

import com.simplecoding.simplerestcontroller.common.ApiResponse;
import com.simplecoding.simplerestcontroller.vo.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@RestController
public class ResponseController {

    //	따라하기 예제 1
    @GetMapping("/ex05/example01")
    public ResponseEntity<ApiResponse<List<String>>> example01(@RequestParam(defaultValue = "") String name,
                                                               @RequestParam(defaultValue = "") String id) {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(id);

        ApiResponse<List<String>> apiResponse = new ApiResponse<>(list);
        return ResponseEntity.ok(apiResponse);
    }

    //	따라하기 예제 2
    @PostMapping("/ex05/example02")
    public ResponseEntity<Void> example02(
            @RequestBody Member member
    ) {
        log.debug(member);
        return ResponseEntity.ok().build();
    }

    //	따라하기 예제 3
    @PutMapping("/ex05/example03/{id}")
    public ResponseEntity<Void> example03(
            @PathVariable String id,
            @RequestBody Member member
    ) {
        log.debug(member);
        return ResponseEntity.ok().build();
    }

    //	따라하기 예제 4
    @DeleteMapping("/ex05/example04/{id}")
    public ResponseEntity<Void> example04(
            @PathVariable String id
    ) {
        log.debug(id);
        return ResponseEntity.ok().build();
    }
}
