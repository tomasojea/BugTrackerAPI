package com.bugtracking.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "issue")
public class Issue {

  
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int issue_id;
    private String issue_summary;
    private String issue_description;
    private Integer identified_by_person_id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date identified_date;
    private Long related_project;
    private Integer assigned_to;
    private String status;
    private String priority;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date target_resolution_date;
    private String progress;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date actual_resolution_date;
    private String resolution_summary;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created_on;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created_by;
    private Date modified_on;
    private Date modified_by;
    
 


    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public String getIssue_summary() {
        return issue_summary;
    }

    public void setIssue_summary(String issue_summary) {
        this.issue_summary = issue_summary;
    }

    public String getIssue_description() {
        return issue_description;
    }

    public void setIssue_description(String issue_description) {
        this.issue_description = issue_description;
    }
    
    public Long getRelated_project() {
        return related_project;
    }

    public void setRelated_project(Long related_project) {
        this.related_project = related_project;
    }
    
    
    @JsonIgnore
    public int getIdentified_by_person_id() {
        return identified_by_person_id;
    }

    public void setIdentified_by_person_id(int identified_by_person_id) {
        this.identified_by_person_id = identified_by_person_id;
    }

    public Date getIdentified_date() {
        return identified_date;
    }

    public void setIdentified_date(Date identified_date) {
        this.identified_date = identified_date;
    }

   
    public int getAssigned_to() {
        return assigned_to;
    }
    @JsonIgnore
    public void setAssigned_to(Integer assigned_to) {
        if(assigned_to == null){
            assigned_to = 1;
        }
            this.assigned_to = assigned_to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getTarget_resolution_date() {
        return target_resolution_date;
    }

    public void setTarget_resolution_date(Date target_resolution_date) {
        this.target_resolution_date = target_resolution_date;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Date getActual_resolution_date() {
        return actual_resolution_date;
    }

    public void setActual_resolution_date(Date actual_resolution_date) {
        this.actual_resolution_date = actual_resolution_date;
    }

    public String getResolution_summary() {
        return resolution_summary;
    }

    public void setResolution_summary(String resolution_summary) {
        this.resolution_summary = resolution_summary;
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
