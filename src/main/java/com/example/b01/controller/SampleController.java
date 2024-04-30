package com.example.b01.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Log4j2
public class SampleController {


    @ResponseBody
    @GetMapping("/aaa")
    public String aaa(){

        return "안녕하세요";
    }

    @GetMapping("/bbb")
    public void bbb(Model model){
        log.info("bbb페이지 입니다.");
        model.addAttribute("name", "홍길동");
    }

}
