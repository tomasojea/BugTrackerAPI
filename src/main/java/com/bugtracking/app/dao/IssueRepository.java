
package com.bugtracking.app.dao;
import com.bugtracking.app.entity.GraphBar;
import com.bugtracking.app.entity.GraphData;
import com.bugtracking.app.entity.GraphLine;
import com.bugtracking.app.entity.GraphScatter;
import com.bugtracking.app.entity.Issue;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//
@RepositoryRestResource()
@CrossOrigin()
public interface IssueRepository extends JpaRepository<Issue, Integer>{
    
    @Query(value="select new com.bugtracking.app.entity.GraphData(count(priority), priority) from Issue where priority is not null  group by priority")
    @RestResource()
    List<GraphData> dataPieGraph();
    
    @Query(value="select new com.bugtracking.app.entity.GraphLine(s.identified_date,count(s.status), s.status) from Issue s where s.status is not null group by s.identified_date")
    @RestResource()
    List<GraphLine> dataLineGraph();
    
    @Query(nativeQuery = true, name = "graph_scatter_native")
    @RestResource()
    List<GraphScatter> dataScatterGraph();
   /* @Query(value="select new com.bugtracking.app.entity.GraphScatter(s.status,count(s.priority), s.priority) from Issue s where ((s.status like  'Open%') or (s.status like 'Close%') or (s.status like 'InProgress%') and (s.priority like 'Low%') or (s.priority like 'High%') or (s.priority like 'Medium%')) group by s.status, s.priority")
    @RestResource()
    List<GraphScatter> dataScatterGraph();*/
    
    
    
}
