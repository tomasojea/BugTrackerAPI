
package com.bugtracking.app.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GraphScatter implements Serializable {
    
    @Id
    private int id;
    private String status;
    private Long countPriority;
    private String priority;

    public GraphScatter(String status, Long countPriority, String priority) {
        this.status = status;
        this.countPriority = countPriority;
        this.priority = priority;
    }

   
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

   
    public String getStatus() {
        return status;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    
    public Long getCountPriority() {
        return countPriority;
    }

    
    public void setCountPriority(Long countPriority) {
        this.countPriority = countPriority;
    }

   
    public String getPriority() {
        return priority;
    }

   
    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    
    
    
    
}
