package api.model;

public class Result {

	private int score;
	private int rank;
	private int pointsBalance;
		
	@Id
	@GeneratedValue
	public long id;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getPointsBalance() {
		return pointsBalance;
	}
	public void setPointsBalance(int pointsBalance) {
		this.pointsBalance = pointsBalance;
	}
}
