package javaProject;

class MatchPoint {
	private int score;   
	private int totalscore;
	@SuppressWarnings("unused")
	private int Atotalscore;
	@SuppressWarnings("unused")
	private int Btotalscore;
	private int game;   
	private int set;   
	public int gettotalScore() {
		return totalscore = game;
	}
	public void settotalScore(int totalscore) {
		this.totalscore = totalscore;
	}
	public int getAtotalScore() {
		return Atotalscore = totalscore;
	}
	public void setAtotalScore(int Atotalscore) {
		this.Atotalscore = Atotalscore;
	}
	public int getBtotalScore() {
		return Btotalscore = totalscore;
	}
	public void setBtotalScore(int Btotalscore) {
		this.Btotalscore = Btotalscore;
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