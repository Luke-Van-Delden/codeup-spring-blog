package com.codeup.codespringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping("/add/{num}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable int num, @PathVariable int num2) {
        return String.valueOf((num + num2));
    }

    @GetMapping("/subtract/{num2}/from/{num}")
    @ResponseBody
    public String subtract(@PathVariable int num, @PathVariable int num2) {
        return String.valueOf((num - num2));
    }

    @GetMapping("/multiply/{num}/and/{num2}")
    @ResponseBody
    public String multiply(@PathVariable int num, @PathVariable int num2) {
        return String.valueOf((num * num2));
    }

    @GetMapping("/divide/{num}/by/{num2}")
    @ResponseBody
    public String divide(@PathVariable int num, @PathVariable int num2) {
        return String.valueOf((num / num2));
    }

}
