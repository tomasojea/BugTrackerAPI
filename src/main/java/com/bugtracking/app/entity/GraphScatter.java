
package com.bugtracking.app.entity;

import java.io.Serializable;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

@Entity
@NamedNativeQuery(
    name="graph_scatter_native",
    query="SELECT i.status, count(m.priority) as countPriorityTotal,  countPriority,  m.priority FROM issue as i " + 
          "INNER JOIN (select status, count(priority) as countPriority, priority from issue " +
          "where status regexp 'Open|Close|InProgress' and priority  regexp 'Low|High|Medium' " +
          "group by status, priority ) as m ON m.status = i.status  group by i.status, m.priority",
    resultSetMapping="graph_result"
)
@SqlResultSetMapping(
    name="graph_result",
    classes = @ConstructorResult(
        targetClass = GraphScatter.class,
        columns = {
            @ColumnResult(name="status",type = String.class),
            @ColumnResult(name="countPriorityTotal",type = Long.class),
            @ColumnResult(name="countPriority",type = Long.class),
            @ColumnResult(name="priority",type = String.class)
        }
    )
)
public class GraphScatter implements Serializable {

   
   
    
    @Id
    private int id;
    private String status;
    private Long countPriorityTotal;
    private Long countPriority;
    private String priority;

    public GraphScatter(String status, Long countPriorityTotal, Long countPriority, String priority) {
        this.status = status;
        this.countPriorityTotal = countPriorityTotal;
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
    
     public Long getCountPriorityTotal() {
        return countPriorityTotal;
    }

    
    public void setCountPriorityTotal(Long countPriorityTotal) {
        this.countPriorityTotal = countPriorityTotal;
    }
    
    
    
}
