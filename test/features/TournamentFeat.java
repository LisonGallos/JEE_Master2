package api.features;

import java.time.LocalDateTime;

import api.model.Match;
import api.model.Phase;
import api.model.Result;
import api.model.Tournament;

public interface TournamentFeat {

	// Tournament features
	public Tournament createTournament(String name);
	
	public Phase createPhaseFor( long tournamentID, String name );
	public Match createMathFor( long phaseID, LocalDateTime date);
	public Result setResult( long matchID, long memberID, int score, int rank, int balance);
	
	
}
