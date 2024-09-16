package quiz.model;

public class GetAllQuizWrapper {
	private int ID;
	private String TITLE;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	
	@Override
	public String toString() {
		return "GetAllQuizWrapper [ID=" + ID + ", TITLE=" + TITLE + "]";
	}
}
