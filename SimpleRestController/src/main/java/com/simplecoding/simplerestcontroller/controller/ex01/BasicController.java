/**
 * 
 */
package com.simplecoding.simplerestcontroller.controller.ex01;

import com.simplecoding.simplerestcontroller.common.ApiResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simple-coding
 *
 */
@RestController
public class BasicController {

//	따라하기 예제 1
	@GetMapping("/ex01/example01")
	public String example01() {
		return "안녕 Spring";
	}
	
//	따라하기 예제 2
	@GetMapping("/ex01/example02")
	public ApiResponse<String> example02() {
        ApiResponse<String> apiResponse = new ApiResponse<>("안녕 Spring");
		return apiResponse;
	}

//	따라하기 예제 3
	@GetMapping("/ex01/example03")
	public ApiResponse<List<String>> example03() {
        List<String > list = new ArrayList<>();
        list.add("안녕 스프링");
        list.add("안녕 스프링2");

        ApiResponse<List<String>> apiResponse = new ApiResponse<>(list);
		return apiResponse;
	}
}