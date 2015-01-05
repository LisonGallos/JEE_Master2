package api.model;

import java.util.Collection;

public class MemberGame {

	private boolean own;
	private int note;
	private int partiesPlayed;
	private int points;
	private Rank rank;
	
	@ManyToOne
    private BoardGame boardGame;
	
	@OneToMany
	private Collection<Member> members ;
	
	public BoardGame getBoardGame() {
		return boardGame;
	}
	public void setBoardGame(BoardGame boardGame) {
		this.boardGame = boardGame;
	}
	public Collection<Member> getMembers() {
		return members;
	}
	public void setMembers(Collection<Member> members) {
		this.members = members;
	}
	public boolean isOwn() {
		return own;
	}
	public void setOwn(boolean own) {
		this.own = own;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public int getPartiesPlayed() {
		return partiesPlayed;
	}
	public void setPartiesPlayed(int partiesPlayed) {
		this.partiesPlayed = partiesPlayed;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
}
