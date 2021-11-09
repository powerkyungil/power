package monster;

public class Monster {
	private String monsterName;
	private int monsterHp;
	private int monsterPower;
	
	
	public String getMonsterName() {
		return monsterName;
	}
	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}
	public int getMonsterHp() {
		return monsterHp;
	}
	public void setMonsterHp(int monsterHp) {
		this.monsterHp = monsterHp;
	}
	public int getMonsterPower() {
		return monsterPower;
	}
	public void setMonsterPower(int monsterPower) {
		this.monsterPower = monsterPower;
	}
	@Override
	public String toString() {
		return "Monster [monsterName=" + monsterName + ", monsterHp=" + monsterHp + ", monsterPower=" + monsterPower
				+ "]";
	}
	
	
	
}
