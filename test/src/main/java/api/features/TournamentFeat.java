package api.features;


import java.util.Date;

import api.model.Matchs;
import api.model.Phase;
import api.model.Result;
import api.model.Tournament;

public interface TournamentFeat {

	// Tournament features
	public Tournament createTournament(String name);
	
	public Phase createPhaseFor( long tournamentID, String name );
	public Matchs createMathFor( long phaseID, Date date);
	public Result setResult( long matchID, long memberID, int score, int rank, int balance);
	
	
}
