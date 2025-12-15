/**
 * 
 */
package com.simplecoding.simplerestcontroller.controller.qz03;

import com.simplecoding.simplerestcontroller.common.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simple-coding
 *
 */
@RestController
public class Quiz03Controller {

    //	따라하기 예제 1
    @GetMapping("/qz03/quiz01")
    public ApiResponse<List<String>> quiz01(@RequestParam(defaultValue = "") String dno,
                                               @RequestParam(defaultValue = "") String dname,
                                               @RequestParam(defaultValue = "") String loc) {
        List<String > list = new ArrayList<>();
        list.add(dno);
        list.add(dname);
        list.add(loc);

        ApiResponse<List<String>> apiResponse = new ApiResponse<>(list);
        return apiResponse;
    }
}
