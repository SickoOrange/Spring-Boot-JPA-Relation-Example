# Spring-Boot-JPA-Relation-Example
## One To One relation
The book and book_detail tables habe a one-to-one relationship via book.book_detail_id and book_detail.id.

#### Book Entity

	@Entity
	public class Book {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private String name;


	    @OneToOne(cascade = CascadeType.ALL)
	    private BookDetail bookDetail;

		..................
		..................
	}
#### BookDetail Entity

	@Entity
	public class BookDetail {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private long numberOfPages;

	    @OneToOne(mappedBy ="bookDetail")
	    private Book book;
		..................
		..................
	    }

###### mappedBy Annotation
	The member variable(book in the BookDetail) that is mapped to this annotation is no longer present in the table which generated by this class. 


	The value of this "MappedBy" is a member varible(bookDetails) of this class, that appears in other class(Book), this member variable will appear in that table. 

## One To Many relation
