package quiz;

import org.springframework.stereotype.Component;

@Component
public class Utility {
	private String domain;
	private String count;
	private String title;
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Utility [domain=" + domain + ", count=" + count + ", title=" + title + "]";
	}
	
	
	
	
}
