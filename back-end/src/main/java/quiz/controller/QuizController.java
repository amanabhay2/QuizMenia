package quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quiz.Utility;
import quiz.model.GetAllQuizWrapper;
import quiz.model.QuizWrapper;
import quiz.service.QuizService;

@RestController
@RequestMapping("/quizPlay")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<List<QuizWrapper>> getthequiz(@PathVariable int id){
		System.out.println("Fetching quiz");
		return quizService.getQuiz(id);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> create(@RequestBody Utility obj) {
		System.out.println("Creating Quiz");
		return quizService.createQuiz(obj);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<GetAllQuizWrapper>> getAll(){
		System.out.println("Start GetAllQuestions");
		return quizService.getAll();
	}
	
	
}
