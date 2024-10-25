package com.diego.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diego.curso.springboot.webapp.springboot_web.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required=false, defaultValue="No hay parametros") String message) {

        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;
    }
    
    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String text, @RequestParam Integer code){
        ParamDto param = new ParamDto();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }

    @GetMapping("/request")
    public ParamDto request(HttpServletRequest request){

        Integer code = 000;
        try {
            code = Integer.valueOf(request.getParameter("code"));
        } catch (NumberFormatException e) {}

        ParamDto param = new ParamDto();
        param.setCode(code);
        param.setMessage(request.getParameter("message"));
        return param;
    }
}
