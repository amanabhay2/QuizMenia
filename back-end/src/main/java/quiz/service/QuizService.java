package quiz.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import quiz.Utility;
import quiz.model.GetAllQuizWrapper;
import quiz.model.QUIZ_TABLE;
import quiz.model.Quiz;
import quiz.model.QuizWrapper;
import quiz.repository.QuizRepository;
import quiz.repository.Repository;

@Service
public class QuizService {

	@Autowired
	private QuizRepository quizRepo;
	@Autowired
	private Repository repo;
	
	
	public ResponseEntity<String> createQuiz(Utility obj) {
		try {
			List<QUIZ_TABLE> questions =repo.findByDOMAIN(obj.getDomain(),obj.getCount());
			System.out.println(obj.getCount());
			Quiz quiz=new Quiz();
			quiz.setTITLE(obj.getTitle());
			quiz.setQuestions(questions);
			quizRepo.save(quiz);
			return new ResponseEntity<>("Quiz Created Successfully",HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e.toString());
			return new ResponseEntity<>("Unexpected error occured. Quiz creation failed",HttpStatus.BAD_REQUEST);
		}
	}


	public ResponseEntity<List<QuizWrapper>> getQuiz(int id) {
		try {
			System.out.println("Stage 1");
			Quiz quiz=quizRepo.findById(id).get();
			List<QUIZ_TABLE> dbQuestions=quiz.getQuestions();
			List<QuizWrapper> resultQuestions=new ArrayList<>();
			System.out.println("Stage 2");
			for(QUIZ_TABLE q : dbQuestions) {
				QuizWrapper temp=new QuizWrapper();
				temp.setID(q.getID());
				temp.setQUESTIONTITLE(q.getQUESTIONTITLE());
				temp.setOPTION1(q.getOPTION1());
				temp.setOPTION2(q.getOPTION2());
				temp.setOPTION3(q.getOPTION3());
				temp.setOPTION4(q.getOPTION4());
				temp.setRIGHTANSWER(q.getRIGHTANSWER());
				resultQuestions.add(temp);
			}
			System.out.println("Stage 3");
			return new ResponseEntity<List<QuizWrapper>>(resultQuestions,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		}
	}


	public ResponseEntity<List<GetAllQuizWrapper>> getAll() {
		try {
				System.out.println("Stage 1");
				List<Quiz> quiz=quizRepo.findAll();
				List<GetAllQuizWrapper> resp=new ArrayList<>();
				System.out.println("Stsge 2");
				for(Quiz qz : quiz) {
					GetAllQuizWrapper temp=new GetAllQuizWrapper();
					temp.setID(qz.getID());
					temp.setTITLE(qz.getTITLE());
					resp.add(temp);
				}
				System.out.println("Stage 3");
				return new ResponseEntity<List<GetAllQuizWrapper>>(resp,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_GATEWAY);
		}
	}


	


	
	
	
}
