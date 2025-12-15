/**
 * 
 */
package com.simplecoding.simplerestcontroller.controller.qz02;

import com.simplecoding.simplerestcontroller.common.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simple-coding
 *
 */
@RestController
public class Quiz02Controller {
    //	퀴즈 예제 1
    @GetMapping("/qz02/quiz01")
    public ApiResponse<String> quiz01(@RequestParam(defaultValue = "") String id) {
        ApiResponse<String> apiResponse = new ApiResponse<>(id);
        return apiResponse;
    }

    //    퀴즈 예제 2
    @GetMapping("/qz02/quiz02/{id}")
    public ApiResponse<String> quiz02(@PathVariable String id) {
        ApiResponse<String> apiResponse = new ApiResponse<>(id);
        return apiResponse;
    }
}
