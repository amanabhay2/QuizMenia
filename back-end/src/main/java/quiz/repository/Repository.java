package quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import quiz.model.QUIZ_TABLE;

@Component
public interface Repository extends JpaRepository<QUIZ_TABLE, Integer>{

	@Query(value="SELECT * FROM QUIZ_TABLE q WHERE lower(q.DOMAIN)=lower(:domain) AND ROWNUM <= :count",nativeQuery=true)
	List<QUIZ_TABLE> findByDOMAIN(@Param("domain") String domain
								  ,@Param("count") String limCount);

}
