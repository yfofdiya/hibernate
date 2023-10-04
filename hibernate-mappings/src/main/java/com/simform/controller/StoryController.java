package com.simform.controller;

import com.simform.entity.Story;
import com.simform.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/stories")
public class StoryController {

    @Autowired
    private StoryService storyService;

    @GetMapping
    public List<Story> getBookDetails() {
        List<Story> stories = storyService.getBookDetails();
        return stories;
    }
}