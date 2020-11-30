
public class Scaffale {
	private int numeroLibriMax;
	private int numeroLibriPresenti;
	private Libro libri[]; // crea il riferimento al vettore ma non lo spazio per i riferimenti ai libri
	
	public Scaffale(int nMax) {
		this.numeroLibriMax = nMax;
		this.libri = new Libro[nMax]; // crea lo spazio per i riferimenti ai libri ma non quello per i singoli libri
		this.numeroLibriPresenti = 0;
	}
	
	public int aggiungiLibro(Libro l) {
		if (numeroLibriPresenti<numeroLibriMax) {
			libri[numeroLibriPresenti] = new Libro(l.getISBN(), l.getTitolo()); // crea lo spazio per il singolo libro
			numeroLibriPresenti++;
			return(numeroLibriMax - numeroLibriPresenti);
		}
		else {
			return(0);
		}

	}
	
	// data la posizione, trovare il titolo del libro
	
	public Libro getLibro(int pos) {
		if (pos < numeroLibriPresenti) {
			return(libri[pos]);
		}
		else { 
			return(null);
		}
	}
	
	// dato il codice ISBN trovare il titolo
	
	// dato il titolo trovare il codice ISBN
	
	// dato ISBN trovare la posizione nella libreria
	
	// dato il titolo trovare la posizione nella libreria
	
	public int getNumeroLibriMax() {
		return numeroLibriMax;
	}

	public int getNumeroLibriPresenti() {
		return numeroLibriPresenti;
	}

}
