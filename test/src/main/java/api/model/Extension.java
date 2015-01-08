package api.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("E")
public class Extension extends BoardGame{

	
	@ManyToOne
	public BoardGame game;
	
	public Extension(){
		super();
	}
	
	
}
