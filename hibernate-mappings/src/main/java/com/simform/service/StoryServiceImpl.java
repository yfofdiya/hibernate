package com.simform.service;

import com.simform.entity.Story;
import com.simform.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryServiceImpl implements StoryService {

    @Autowired
    private StoryRepository storyRepository;

    @Override
    public List<Story> getBookDetails() {
        return storyRepository.findAll();
    }
}
