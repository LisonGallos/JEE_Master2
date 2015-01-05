package api.model;

import java.util.Collection;

public class Member {

	private String email;
	private String firstname;
	private String lastname;
	private String password;
	
	
	@ManyToMany
    private Collection<Match> matchs ;
	
	public Collection<Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(Collection<Match> matchs) {
		this.matchs = matchs;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
