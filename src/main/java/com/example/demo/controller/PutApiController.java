package com.example.demo.controller;

import com.example.demo.dto.PostRequestDto;
import com.example.demo.dto.RequestCarDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/put")
public class PutApiController {

    @PutMapping("")
    public RequestCarDto put(@RequestBody RequestCarDto requestCarDto) {
        System.out.println(requestCarDto.toString());

        return requestCarDto;
    }

    @PutMapping("/{userId}")
    public RequestCarDto putPathVariable(@RequestBody RequestCarDto requestCarDto, @PathVariable(name = "userId") Long id) {
        System.out.println(id);
        System.out.println(requestCarDto.toString());

        return requestCarDto;
    }
}
