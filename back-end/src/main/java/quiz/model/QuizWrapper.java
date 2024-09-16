package quiz.model;

import org.springframework.stereotype.Component;

@Component
public class QuizWrapper {
	
	private int ID;
	private String QUESTIONTITLE;
	private String OPTION1;
	private String OPTION2;
	private String OPTION3;
	private String OPTION4;
	private String RIGHTANSWER;
	
	public int getID() {
		return ID;
	}
	
	public String getRIGHTANSWER() {
		return RIGHTANSWER;
	}
	public void setRIGHTANSWER(String rIGHTANSWER) {
		RIGHTANSWER = rIGHTANSWER;
	}
	public void setID(int iD) {
		ID = iD;
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
	@Override
	public String toString() {
		return "QuizWrapper [ID=" + ID + ", QUESTIONTITLE=" + QUESTIONTITLE + ", OPTION1=" + OPTION1 + ", OPTION2="
				+ OPTION2 + ", OPTION3=" + OPTION3 + ", OPTION4=" + OPTION4 + ", RIGHTANSWER=" + RIGHTANSWER + "]";
	}
}
