package player;

public class Player {
	private String playerName;
	private int playerHp;
	private int playerPower;
	
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerHp() {
		return playerHp;
	}
	public void setPlayerHp(int playerHp) {
		this.playerHp = playerHp;
	}
	public int getPlayerPower() {
		return playerPower;
	}
	public void setPlayerPower(int playerPower) {
		this.playerPower = playerPower;
	}
	@Override
	public String toString() {
		return "Monster [playerName=" + playerName + ", playerHp=" + playerHp + ", playerPower=" + playerPower
				+ "]";
	}
	
	
	
}
