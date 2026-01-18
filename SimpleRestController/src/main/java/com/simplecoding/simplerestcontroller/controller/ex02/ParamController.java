package com.simplecoding.simplerestcontroller.controller.ex02;

import com.simplecoding.simplerestcontroller.common.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {
    
//	따라하기 예제 1
    @GetMapping("/ex02/example01")
    public ApiResponse<String> example01(@RequestParam(defaultValue = "") String name) {
        ApiResponse<String> apiResponse = new ApiResponse<>(name);
        return apiResponse;
    }

//    따라하기 예제 2
    @GetMapping("/ex02/example02/{name}")
    public ApiResponse<String> example02(@PathVariable String name) {
        ApiResponse<String> apiResponse = new ApiResponse<>(name);
        return apiResponse;
    }
}
