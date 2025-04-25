package com.learn.JobApp.controller;

import com.learn.JobApp.model.JobPost;
import com.learn.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("/jobPosts")
    public List<JobPost> jobPosts(){
        return service.viewAllJobs();
    }

    @GetMapping("/jobPost/{postId}")
    public JobPost jobPost(@PathVariable int postId){
        return service.viewJob(postId);
    }

    @PostMapping("/jobPost")
    public JobPost addJobPost(@RequestBody JobPost jobPost){

        service.addJob(jobPost);
        return service.viewJob(jobPost.getJobId());
    }

    @PutMapping("/jobPost")
    public JobPost UpdateJobPost(@RequestBody JobPost jobPost){

        service.addJob(jobPost);
        return service.viewJob(jobPost.getJobId());
    }

    @DeleteMapping("/jobPost/{postId}")
    public void deleteJobPost(@PathVariable int postId){
         service.removeJob(postId);
    }


}
