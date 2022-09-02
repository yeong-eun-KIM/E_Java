package kr.co.ezenac.playeungyong;

public class Player {
	
	private PlayerLevel level;
	public Player () {
		level = new BeginnerLevel();
		level.showMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
