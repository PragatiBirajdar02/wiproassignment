package Library;

import java.util.ArrayList;
import java.util.List;

public class Librarysystem {
	List<Audiobook> audio = new ArrayList<>();
	List<Book> book = new ArrayList<>();
	List<Magzine> magazine = new ArrayList<>();

	
	
	public Librarysystem() { }
	public Librarysystem(List<Audiobook> audio, List<Book> book, List<Magzine> magazine) {
		
		this.audio = audio;
		this.book = book;
		this.magazine = magazine;
	}
	
	//add audio to audiobook
	public void AddAudiobookList(List<Audiobook> audio) {
		for(Audiobook ad: audio)
			this.audio.add(ad);
	}
	public void AddAudiobookList(Audiobook audio) {
			this.audio.add(audio);
	}
	//add book
	public void AddBookList(List<Book> book) {
		for(Book bk: book)
			this.book.add(bk);
	}
	public void AddBookList(Book book) {
			this.book.add(book);
	}
	//add Magazine
	public void AddMagazineList(List<Magzine> magazine) {
		for(Magzine mg: magazine)
			this.magazine.add(mg);
	}
	public void AddMagazineList(Magzine magazine) {
			this.magazine.add(magazine);
	}
	
	
	
	//display materials
	void displayMaterials() {
		
		for(Audiobook au: audio)
			System.out.println(au);
		//System.out.println("\n");
		
		for(Book bk: book)
			System.out.println(bk);
		//System.out.println("\n");
		
		for(Magzine mg: magazine)
			System.out.println(mg);
		
	}
	
	//checkout
	void checkoutAudobook() {
		if(audio.size() >0)
			audio.get(0).checkout();
	}
	void checkoutBook() {
		if(book.size() >0)
			book.get(0).checkout();
	}
	void checkoutMagazine() {
		if(magazine.size() >0)
			magazine.get(0).checkout();
	}
	
	//return 
	void returnAudobook() {
		audio.get(0).returnMaterial();
	}
	void returnBook() {
		book.get(0).returnMaterial();
	}
	void returnMagazine() {
		magazine.get(0).returnMaterial();
	}

	
	
	
	
	
}
