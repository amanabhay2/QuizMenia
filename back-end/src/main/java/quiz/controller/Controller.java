package quiz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quiz.model.QUIZ_TABLE;
import quiz.service.Service;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/quiz")
public class Controller {
	@Autowired
	private Service service;
	
	@PostMapping("/test")
	public ResponseEntity<String> test(@RequestBody Map<String, Object> body) {
	    System.out.println("Received: " + body);
	    return ResponseEntity.ok("Received");
	}

	
	@PostMapping("/addQuestion")
	public ResponseEntity<String> addQuestion(@RequestBody QUIZ_TABLE question) {
		System.out.println("Adding Question...."+question.toString());
		return service.addQuestion(question);
	}
	
	@GetMapping("/getQuestion/{ID}")
	public ResponseEntity<QUIZ_TABLE> getQuestion(@PathVariable int ID) {
		System.out.println("Fetching Question by id");
		return service.getQuestion(ID);
	}
	
	@GetMapping("/getAllQuestion")
	public ResponseEntity<List<QUIZ_TABLE>> getAllQuestion() {
		System.out.println("Fetching all questions....");
		return service.getAllQuestion();
	}
	
	@PutMapping("/updateQuestion")
	public ResponseEntity<String> updateQuestion(@RequestBody QUIZ_TABLE question) {
		System.out.println("New Question  "+question.toString());
		System.out.println("Updating Question ...");
		return service.updateQuestion(question);
	}
	
	@DeleteMapping("/deleteQuestion/{ID}")
	public ResponseEntity<String> deleteQuestion(@PathVariable int ID) {
		System.out.println("Deleting started");
		return service.deleteQuestion(ID);
	}
}
