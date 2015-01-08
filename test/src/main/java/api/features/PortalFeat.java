package api.features;

import api.model.OnlinePortal;
import api.model.SiteAccount;


public interface PortalFeat {

	// OnlinePortal
	public OnlinePortal createPortal(String name, String url);
	public SiteAccount addAccountFor( long memberID, long portalID, String login );
	
	
}
