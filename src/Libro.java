
public class Libro { 
	private int ISBN;
	private String titolo;
	
	public Libro(int ISBN, String titolo) {
		this.ISBN = ISBN;
		this.titolo = titolo;
	}
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
}
