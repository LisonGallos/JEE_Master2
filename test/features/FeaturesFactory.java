package api.features;

public abstract class FeaturesFactory {

	public static FeaturesFactory instance;
	
	public abstract BoardGameFeat getBoardGameFeatures();
	public abstract MemberFeat getMemberFeatures();
	public abstract PortalFeat getPortalFeatures();
	public abstract TournamentFeat getTournamentFeatures();
	
}
