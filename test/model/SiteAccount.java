package api.model;

import java.util.Collection;

public class SiteAccount {

	private String login;
	
	@OneToMany
	private Collection<Member> members ;
	
	@ManyToOne
    private OnlinePortal onlinePortal;
	
	public OnlinePortal getOnlinePortal() {
		return onlinePortal;
	}

	public void setOnlinePortal(OnlinePortal onlinePortal) {
		this.onlinePortal = onlinePortal;
	}

	public Collection<Member> getMembers() {
		return members;
	}

	public void setMembers(Collection<Member> members) {
		this.members = members;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	} 
}
