package com.simplecoding.simplerestcontroller.controller.ex03;

import com.simplecoding.simplerestcontroller.common.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MultiParamController {
//	따라하기 예제 1
	@GetMapping("/ex03/example01")
	public ApiResponse<List<String>> example01(@RequestParam(defaultValue = "") String name,
			@RequestParam(defaultValue = "") String id) {
        List<String > list = new ArrayList<>();
        list.add(name);
        list.add(id);

        ApiResponse<List<String>> apiResponse = new ApiResponse<>(list);
        return apiResponse;
	}
}
