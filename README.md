# JobApp - CRUD Operations for Job Posts

This is a Spring Boot application for managing job posts. It provides RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on job posts.

## Features

- View all job posts
- View a single job post by ID
- Add a new job post
- Update an existing job post
- Delete a job post by ID

## Tech Stack

- Java 21
- Spring Boot
- Maven
- Spring Web
- Spring Data JPA
- PostgreSQL

## API Endpoints

### 1. **View All Job Posts**  
**GET** `/jobPosts`  
Returns a list of all job posts.

### 2. **View a Job Post by ID**  
**GET** `/jobPost/{postId}`  
Returns the job post with the specified ID.

### 3. **Add a New Job Post**  
**POST** `/jobPost`  
Creates a new job post. You need to send a JSON object containing the job details.

### 4. **Update an Existing Job Post**  
**PUT** `/jobPost`  
Updates the details of an existing job post. You need to send the updated job post in the request body.

### 5. **Delete a Job Post by ID**  
**DELETE** `/jobPost/{postId}`  
Deletes the job post with the specified ID.
