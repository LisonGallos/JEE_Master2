package api.features;

import api.model.Member;

public interface MemberFeat {

	// Members features
	public Member createMember(String firstName, String lastName, String email, String password);
	public boolean memberExists(String email);
	public boolean auth(String email, String password);
	
	
}
