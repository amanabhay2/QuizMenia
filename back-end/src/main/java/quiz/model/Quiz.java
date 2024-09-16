package quiz.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	private String TITLE;
	
	@ManyToMany
	private List<QUIZ_TABLE> questions;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String dOMAIN) {
		TITLE = dOMAIN;
	}
	public List<QUIZ_TABLE> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QUIZ_TABLE> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "Quiz [ID=" + ID + ", TITLE=" + TITLE + ", questions=" + questions + "]";
	}

	
}
