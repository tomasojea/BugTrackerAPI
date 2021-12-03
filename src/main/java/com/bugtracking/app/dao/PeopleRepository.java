package com.bugtracking.app.dao;

import com.bugtracking.app.entity.GraphBar;
import com.bugtracking.app.entity.GraphData;
import com.bugtracking.app.entity.People;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin()
public interface PeopleRepository extends CrudRepository<People, Integer>{
    
    @Query(value="SELECT new com.bugtracking.app.entity.GraphBar( p.person_name,count(i.identified_by_person_id) ) FROM People p JOIN p.issues i group by p.person_name")
    @RestResource()
    List<GraphBar> dataBarGraph();
    
}
