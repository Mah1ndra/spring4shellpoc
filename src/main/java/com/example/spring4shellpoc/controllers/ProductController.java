package com.example.spring4shellpoc.controllers;

import com.example.spring4shellpoc.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ServletContext context;



    @RequestMapping("/pwn")
    public void vulnerable(Product product){

    }

    @RequestMapping("/locate")
    public  String location(){
        return context.getRealPath("");
    }
}
