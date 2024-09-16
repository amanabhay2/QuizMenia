package quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigData.Options;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import quiz.model.QUIZ_TABLE;
import quiz.repository.Repository;
@Component
public class Service {
	@Autowired
	public Repository repo;

	public ResponseEntity<String> addQuestion(QUIZ_TABLE question) {
		try {
			System.out.println("Above");
			System.out.println("Object --> "+question.toString());
			repo.save(question);
			System.out.println("Below");
			return new ResponseEntity<>("Your Question added successfully in Database",HttpStatus.OK);
		}catch(Exception e){
			System.err.println(e.toString());
			return new ResponseEntity<>("Your Question cannot be saved. We are extremly sorry",HttpStatus.BAD_REQUEST);
		}
		
	}

	public ResponseEntity<QUIZ_TABLE> getQuestion(int iD) {
		try {
			System.out.println("Above");
			Optional<QUIZ_TABLE> result=repo.findById(iD);
			System.out.println("Below");
			return new ResponseEntity<>(result.get(),HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e.toString());
			return new ResponseEntity<>(new QUIZ_TABLE(),HttpStatus.BAD_REQUEST);
		}
		
	}

	public ResponseEntity<List<QUIZ_TABLE>> getAllQuestion() {
		try {
			System.out.println("Above");
			List<QUIZ_TABLE> result=repo.findAll();
			System.out.println("Below");
			return new ResponseEntity<List<QUIZ_TABLE>>(result,HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e.toString());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

	public ResponseEntity<String> updateQuestion(QUIZ_TABLE question) {
		try {
			int id=question.getID();
			Optional<QUIZ_TABLE> dbQuestion=repo.findById(id);
			if(dbQuestion.isPresent()) {
				repo.save(question);
				return new ResponseEntity<>("Your Question updated successfully",HttpStatus.OK);
			}
			repo.save(question);
			return new ResponseEntity<>("Your Question not found so created new question successfully",HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e.toString());
			return new ResponseEntity<>("Your Question updated failed",HttpStatus.BAD_REQUEST);
		}		
	}

	public ResponseEntity<String> deleteQuestion(int ID) {
		try {
			Optional<QUIZ_TABLE> ques=repo.findById(ID);
			if(ques.isPresent()) {
				repo.deleteById(ID);
				return new ResponseEntity<>("Question deleted successfully",HttpStatus.OK);
			}
			return new ResponseEntity<>("Question not found in database",HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>("Some error occured ",HttpStatus.BAD_REQUEST);
		}		
	}
}
