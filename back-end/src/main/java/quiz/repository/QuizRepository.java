package quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import quiz.model.Quiz;

@Component
public interface QuizRepository extends JpaRepository<Quiz,Integer>{

}
