package com.bugtracking.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idproject;
    private String project_name;
    private String start_date;
    private Date target_end_date;
    private Date actual_end_date;
    private Date created_on;
    private Date created_by;
    private Date modified_on;
    private Date modified_by;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Issue> issueses;
    
//    public void add(Issue tempIssue){
//        if(issueses == null){
//            issueses = new ArrayList<>();
//        }
//        issueses.add(tempIssue);
//        tempIssue.setRelated_project(this);
//    }
    
    public List<Issue> getIssues() {
        return issueses;
    }

    public void setIssues(List<Issue> issues) {
        this.issueses = issues;
    }

    public int getProject_id() {
        return idproject;
    }

    public void setProject_id(int idproject) {
        this.idproject = idproject;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

  
    public Date getTarget_end_date() {
        return target_end_date;
    }

    public void setTarget_end_date(Date target_end_date) {
        this.target_end_date = target_end_date;
    }

    public Date getActual_end_date() {
        return actual_end_date;
    }

    public void setActual_end_date(Date actual_end_date) {
        this.actual_end_date = actual_end_date;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public Date getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Date created_by) {
        this.created_by = created_by;
    }

    public Date getModified_on() {
        return modified_on;
    }

    public void setModified_on(Date modified_on) {
        this.modified_on = modified_on;
    }

    public Date getModified_by() {
        return modified_by;
    }

    public void setModified_by(Date modified_by) {
        this.modified_by = modified_by;
    }









}
