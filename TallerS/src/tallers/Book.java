/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallers;

/**
 *
 * @author CltControl
 */
public class Book implements Ibook {

String title;
	String author;
	String category;
	float price;
	boolean state;
	
	public Book(String title, String author, String category,float price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		state = false;
		
	}

	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
        
/*Se halló una violacion al principio de responsabilidad unica, ya que la funcionalidad de buscar libros no deberia estar en la clase book.
        En su lugar deberia estar en storebook ya que en esta de administra la estructura que maneja los libros.      
        
      
*/         
    
}
