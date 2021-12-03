/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bugtracking.app.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="graphbar" )
public class GraphBar implements Serializable {
    
    @Id
    private int id;
    private String personName;
    private Long IssueCount;

    public GraphBar(String personName, Long IssueCount) {
       
        this.personName = personName;
        this.IssueCount = IssueCount;
    }

    public int getId() {
        return id;
    }

    public String getPersonName() {
        return personName;
    }

    public Long getIssueCount() {
        return IssueCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setIssueCount(Long IssueCount) {
        this.IssueCount = IssueCount;
    }
    
    
}
