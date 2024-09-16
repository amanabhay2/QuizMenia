package quiz.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "quiz_table")
public class QUIZ_TABLE {
	@Id
		
	private int ID;
	
	
	private String DIFFICULTY;

	private String DOMAIN;

	private String QUESTIONTITLE;

	private String OPTION1;

	private String OPTION2;

	private String OPTION3;

	private String OPTION4;

	private String RIGHTANSWER;
	
	
	public QUIZ_TABLE() {}

	public int getID() {
		return ID;
	}




	public void setID(int iD) {
		ID = iD;
	}




	public String getDIFFICULTY() {
		return DIFFICULTY;
	}




	public void setDIFFICULTY(String dIFFICULTY) {
		DIFFICULTY = dIFFICULTY;
	}




	public String getDOMAIN() {
		return DOMAIN;
	}




	public void setDOMAIN(String dOMAIN) {
		DOMAIN = dOMAIN;
	}




	public String getQUESTIONTITLE() {
		return QUESTIONTITLE;
	}




	public void setQUESTIONTITLE(String qUESTIONTITLE) {
		QUESTIONTITLE = qUESTIONTITLE;
	}




	public String getOPTION1() {
		return OPTION1;
	}




	public void setOPTION1(String oPTION1) {
		OPTION1 = oPTION1;
	}




	public String getOPTION2() {
		return OPTION2;
	}




	public void setOPTION2(String oPTION2) {
		OPTION2 = oPTION2;
	}




	public String getOPTION3() {
		return OPTION3;
	}




	public void setOPTION3(String oPTION3) {
		OPTION3 = oPTION3;
	}




	public String getOPTION4() {
		return OPTION4;
	}




	public void setOPTION4(String oPTION4) {
		OPTION4 = oPTION4;
	}




	public String getRIGHTANSWER() {
		return RIGHTANSWER;
	}




	public void setRIGHTANSWER(String rIGHTANSWER) {
		RIGHTANSWER = rIGHTANSWER;
	}




	@Override
	public String toString() {
		return "QUIZ_TABLE [ID=" + ID + ", DIFFICULTY=" + DIFFICULTY + ", DOMAIN=" + DOMAIN + ", QUESTIONTITLE="
				+ QUESTIONTITLE + ", OPTION1=" + OPTION1 + ", OPTION2=" + OPTION2 + ", OPTION3=" + OPTION3
				+ ", OPTION4=" + OPTION4 + ", RIGHTANSWER=" + RIGHTANSWER + "]";
	}


	
	
	
	
	
}
