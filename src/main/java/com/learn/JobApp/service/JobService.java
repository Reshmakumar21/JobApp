package com.learn.JobApp.service;

import com.learn.JobApp.model.JobPost;
import com.learn.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public List<JobPost> viewAllJobs() {
        return repo.findAll();
    }

    public JobPost viewJob(int jobId){
        return repo.findById(jobId).orElse(null);
    }

    public void addJob(JobPost jobpost) {
        repo.save(jobpost);
    }


    public void removeJob(int postId) {
        repo.deleteById(postId);
    }
}
