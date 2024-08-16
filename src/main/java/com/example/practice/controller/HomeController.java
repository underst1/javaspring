package com.example.practice.controller;

import com.example.practice.entity.Topic;
import com.example.practice.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping("/")
    public String home(Model model) {
        List<Topic> topics = topicRepository.findAll();
        model.addAttribute("list", topics);
        model.addAttribute("title", "Welcome");
        return "home"; // home.html 템플릿을 렌더링합니다.
    }
}