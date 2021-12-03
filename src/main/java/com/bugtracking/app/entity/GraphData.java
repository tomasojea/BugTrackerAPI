package com.bugtracking.app.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class GraphData implements Serializable {
    @Id
    private int id;
    private Long priorityCount;
    private String priority;

    public GraphData(Long priorityCount, String priority) {
        this.priorityCount = priorityCount;
        this.priority = priority;
    }

   
    public Long getPriorityCount() {
        return priorityCount;
    }

  
    public void setPriorityCount(Long priorityCount) {
        this.priorityCount = priorityCount;
    }

   
    public String getPriority() {
        return priority;
    }

   
    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    
}
