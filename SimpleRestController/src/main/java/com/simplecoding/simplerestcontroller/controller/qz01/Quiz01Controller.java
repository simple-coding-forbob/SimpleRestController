/**
 * 
 */
package com.simplecoding.simplerestcontroller.controller.qz01;

import com.simplecoding.simplerestcontroller.common.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simple-coding
 *
 */
@Controller
public class Quiz01Controller {
    //	퀴즈 예제 1
    @GetMapping("/qz01/quiz01")
    public String quiz01() {
        return "안녕 페이지";
    }

    //	퀴즈 예제 2
    @GetMapping("/qz01/quiz02")
    public ApiResponse<String> quiz02() {
        ApiResponse<String> apiResponse = new ApiResponse<>("안녕 페이지");
        return apiResponse;
    }

    //	퀴즈 예제 3
    @GetMapping("/qz01/quiz03")
    public ApiResponse<List<String>> quiz03() {
        List<String > list = new ArrayList<>();
        list.add("안녕 페이지");
        list.add("안녕 페이지2");

        ApiResponse<List<String>> apiResponse = new ApiResponse<>(list);
        return apiResponse;
    }
}
