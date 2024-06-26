package Library;

public class Magzine extends Librarymaterial{
	
	protected int issueNumber;
	
	
	public Magzine(int issueNumber,String title, String author) {
		super();
		this.issueNumber = issueNumber;
		this.title = title;
		this.author = author;
	}

	@Override
	void checkout() {
		System.out.println("CheckOut the Magazine");		
	}

	@Override
	void returnMaterial() {
		System.out.println("Return the Magazine");
		
	}
	
	@Override
	public String toString() {
		return "Magazine [issueNumber=" + issueNumber + ", title=" + title + ", author=" + author + "]";
	}
	

}
