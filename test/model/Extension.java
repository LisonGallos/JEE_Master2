package api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Extension {

	@Id
	@GeneratedValue
	public long id;
	
	@ManyToOne
	public BoardGame game;
}
