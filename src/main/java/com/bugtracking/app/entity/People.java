package com.bugtracking.app.entity;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "people")
public class People {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int person_id;
    private String person_name;
    private String person_email;
    private String person_role;
    private String username;
    private String assigned_project;
    private Date created_on;
    private Date created_by;
    private Date modified_on;
    private Date modified_by;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="identified_by_person_id")
    private Set<Issue> issues;

    public Set<Issue> getAccounts() {
        return issues;
    }

    public void setAccounts(Set<Issue> issues) {
        this.issues = issues;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_email() {
        return person_email;
    }

    public void setPerson_email(String person_email) {
        this.person_email = person_email;
    }

    public String getPerson_role() {
        return person_role;
    }

    public void setPerson_role(String person_role) {
        this.person_role = person_role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAssigned_project() {
        return assigned_project;
    }

    public void setAssigned_project(String assigned_project) {
        this.assigned_project = assigned_project;
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
