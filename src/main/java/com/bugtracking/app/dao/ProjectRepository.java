package com.bugtracking.app.dao;

import com.bugtracking.app.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "projects",path = "projects")
@CrossOrigin()
public interface ProjectRepository extends CrudRepository<Project, Integer>{
    
}
