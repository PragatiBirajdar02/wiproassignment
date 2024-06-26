package Library;

public abstract class Librarymaterial {
	
	protected String title;
	protected String author;
	
	abstract void checkout();
	abstract void returnMaterial();


}
