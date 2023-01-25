package es.studium.Biblioteca;


public class TestBiblioteca
{

	public static void main(String[] args)
	{
		
		Autor autor1= new Autor ("J.K.", " Rowling", "Inglesa");
		
		
		Libro libro1= new Libro ();
		libro1.setTitulo("Harry Potter y la piedra filosofal");
		libro1.setAutor(autor1);
		libro1.setNumeroPaginas(286);
		libro1.setAnioPublicacion(2022);
		libro1.setEditorial("anaya");
		
		System.out.println(libro1.getTitulo()+ " tiene " + libro1.getNumeroPaginas()+ " páginas y el nombre y apellido del autor es " 
		+ libro1.getAutor().getNombre()+ " " + libro1.getAutor().getApellidos());
		
	
		
	}

}
