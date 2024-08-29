package com.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/aids")
public class Controller {
    
    @Autowired
    private Repository repo;

    @PostMapping("/savedata")
    public String saveData(@RequestBody StudentModel s) {
        repo.save(s);
        return "Inserted successfully";
    }
}
