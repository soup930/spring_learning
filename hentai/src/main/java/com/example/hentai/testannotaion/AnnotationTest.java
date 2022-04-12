package com.example.hentai.testannotaion;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@RequestMapping("")
public class AnnotationTest {

    @RequestMapping("/test")
    public String annotationTest() {
        System.out.println("Request reached here");
        return "testdir/test";
    }

}
