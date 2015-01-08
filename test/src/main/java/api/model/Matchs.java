package api.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Matchs {

	@Id
	@GeneratedValue
	public long id;
	
	private Date date;
	
	 @ManyToMany
     private Collection<Member> members ;
	 
	 @OneToMany
	private Collection<Phase> phases;

	public Collection<Phase> getPhases() {
		return phases;
	}

	public void setPhases(Collection<Phase> phases) {
		this.phases = phases;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Collection<Member> getMembers() {
		return members;
	}

	public void setMembers(Collection<Member> members) {
		this.members = members;
	}
}
