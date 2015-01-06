package api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue
	public long id;
	
	public String firstname;
	public String lastname;
	
	@Override
	public String toString() {
		return firstname + " " + lastname;
	}
	
	public static Author create(String firstName, String lastName) {
		Author author = new Author();
		author.firstname = firstName;
		author.lastname = lastName;
		return author;
	}
}
