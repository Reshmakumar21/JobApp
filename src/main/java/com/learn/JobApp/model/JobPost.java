package com.learn.JobApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
public class JobPost {

    @Id
    private int jobId;
    private String jobProfile;
    private String jobDescription;
    private int reqExperience;
    private List<String> techStack;

    public JobPost() {
    }

    public JobPost(int jobId, String jobProfile, String jobDescription, int reqExperience, List<String> techStack) {
        this.jobId = jobId;
        this.jobProfile = jobProfile;
        this.jobDescription = jobDescription;
        this.reqExperience = reqExperience;
        this.techStack = techStack;
    }


    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getReqExperience() {
        return reqExperience;
    }

    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "jobId=" + jobId +
                ", jobProfile='" + jobProfile + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", reqExperience=" + reqExperience +
                ", techStack=" + techStack +
                '}';
    }
}
