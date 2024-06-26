package Library;

public class LibraryMain {

public static void main(String[] args) {
		
		Librarysystem lbSystem = new Librarysystem();
		
		lbSystem.AddAudiobookList(new Audiobook("Bob","Business","Alex"));
		lbSystem.AddBookList(new Book(56,"Java","J.Peterson"));
		lbSystem.AddMagazineList(new Magzine(10023,"Eco-System","Lily"));
		
		lbSystem.checkoutAudobook();
		lbSystem.checkoutMagazine();
		
		lbSystem.displayMaterials();
		
		

	}

}
