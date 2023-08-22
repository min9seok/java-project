package javaProject;

class MatchPoint {
	private int score;   
	private int game;   
	private int set;   
	
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