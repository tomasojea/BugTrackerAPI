/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bugtracking.app.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name ="graphline" )
public class GraphLine implements Serializable {

    
    @Id
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date indentifiedDate;
    private Long statusCount;
    private String status;
    
    public GraphLine(Date indentifiedDate, Long statusCount, String status) {
        this.indentifiedDate = indentifiedDate;
        this.statusCount = statusCount;
        this.status = status;
    }

    
    /**
     * @return the indentifiedDate
     */
    public Date getIndentifiedDate() {
        return indentifiedDate;
    }

    /**
     * @param indentifiedDate the indentifiedDate to set
     */
    public void setIndentifiedDate(Date indentifiedDate) {
        this.indentifiedDate = indentifiedDate;
    }

    /**
     * @return the statusCount
     */
    public Long getStatusCount() {
        return statusCount;
    }

    /**
     * @param statusCount the statusCount to set
     */
    public void setStatusCount(Long statusCount) {
        this.statusCount = statusCount;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
