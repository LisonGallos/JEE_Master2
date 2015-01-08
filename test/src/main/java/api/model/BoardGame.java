package api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="discriminator",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="B")
public class BoardGame {
	
	@Id
	@GeneratedValue
	public long id;
	
	public String name;
	
	public int publicationYear;
	public int minPlayer;
	public int maxPlayer;
	public int playingTime;
	public int suggestedAge;

	@Column(columnDefinition="text")
	public String description;
	
	@OneToMany(fetch=FetchType.LAZY)
	public List<Author> authors = new ArrayList<Author>();
	
	@OneToMany(fetch=FetchType.LAZY)
	public List<Extension> extensions = new ArrayList<Extension>();
	
	@Override
	public String toString() {
		return "BoardGame #" + id +  " [" + name + "]\n" 
				+ ( publicationYear > 0 ? "   published: " + publicationYear + "\n" : "" ) 
				+ ( suggestedAge > 0    ? "   suggested age from: " + suggestedAge + "\n" : "" )
				+ ( minPlayer > 0 && maxPlayer > 0 ? "   nb of players: " + minPlayer + " to " + maxPlayer + "\n" : "" )
				+ ( playingTime > 0     ? "   playing time: " + playingTime + "\n" : "")
				+ ( authors.size() > 0  ? "   authors: " + authors : "" )
				;
	}

}
