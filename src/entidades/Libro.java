package entidades;

/**
 * @author HP
 * @version 1.0
 * @created 17-nov.-2022 08:17:31
 */
public class Libro {

	private String isbn;
	private String title;
	private int editionNumber;
	private String copyright;
	public Autor m_Autor;

	public Libro(){

	}

	public void finalize() throws Throwable {

	}
}//end Libro