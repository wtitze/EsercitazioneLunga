import java.util.Scanner;

public class provaScaffale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scaffale l = new Scaffale(10);
		Scanner in = new Scanner(System.in);
		// inserimento libri
		System.out.println("inserisci il numero di libri da aggiungere alla libreria:");
		int numLibri = in.nextInt();
		for(int i=0; i<numLibri; i++) {
			System.out.println("inserisci il codice ISBN del libro: ");
			int ISBN = in.nextInt();
			in.nextLine();
			System.out.println("inserisci il titolo del libro: ");
			String titolo = in.nextLine();
			Libro lib = new Libro(ISBN, titolo);
			l.aggiungiLibro(lib);
		}
		in.close();
		System.out.println("Libri inseriti: dall'utente ");
		for(int i=0; i<numLibri; i++) {
			System.out.println("ISBN: " + l.getLibro(i).getISBN() + " - titolo: " + l.getLibro(i).getTitolo());
		}
	}
}
