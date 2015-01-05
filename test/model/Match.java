package api.model;

public class Match {

	private DateTime date;
	
	 @ManyToMany(mappedBy="matchs")
     private Collection<Member> members ;

	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public Collection<Member> getMembers() {
		return members;
	}

	public void setMembers(Collection<Member> members) {
		this.members = members;
	}
}
