package javaProject;

class MatchPoint {
	private int score;   
	@SuppressWarnings("unused")
	private int totalscore;
	private int game;   
	private int set;   
	public int gettotalScore() {
		return totalscore = game;
	}
	public void settotalScore(int totalscore) {
		this.totalscore = totalscore;
	}
	public void plusScore() {
		this.score++;
	}
	public void minusScore() {
		this.score--;
	}
	public void plusGame() {
		this.game++;
	}

	public void plusSet() {
		this.set++;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getGame() {
		return game;
	}
	public void setGame(int game) {
		this.game = game;
	}
	public int getSet() {
		return set;
	}
	public void setSet(int set) {
		this.set = set;
	}
}