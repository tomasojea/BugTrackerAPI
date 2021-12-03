package com.bugtracking.app.dao;

import com.bugtracking.app.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "projects",path = "projects")
public interface ProjectRepository extends CrudRepository<Project, Integer>{
    
}
