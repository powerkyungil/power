package boss;

public class Boss {
	private String bossName;
	private int bossHp;
	private int bossPower;
	
	public String getBossName() {
		return bossName;
	}
	public void setBossName(String bossName) {
		this.bossName = bossName;
	}
	public int getBossHp() {
		return bossHp;
	}
	public void setBossHp(int bossHp) {
		this.bossHp = bossHp;
	}
	public int getBossPower() {
		return bossPower;
	}
	public void setBossPower(int bossPower) {
		this.bossPower = bossPower;
	}
	@Override
	public String toString() {
		return "Boss [bossName=" + bossName + ", bossHp=" + bossHp + ", bossPower=" + bossPower + "]";
	}
	
}
