package app;

import java.util.Scanner;


import common.Frame;
import monster.Monster;
import player.Player;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * 고블린vs플레이어
		 * 고블린hp-플레이어power 
		 * 플레이어hp-고블린hp
		 * 고블린 hp == 0 이면 die --> exp+1
		 * 플레이어 hp == 0 이면 die
		 * exp3 획득시 1레벨업
		 * 
		 * 보스vs플레이어
		 * 보스hp-플레이어power 
		 * 플레이어hp-보스hp
		 * 고블린 hp == 0 이면 die --> exp+3
		 * 플레이어 hp == 0 이면 die
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("=============================");
			System.out.println("==1.일반던전  2.보스던전  3.일반몬스터정보 4.보스몬스터정보==");
			System.out.println("=============================");
			System.out.println("선택 >>");
			int selected = scanner.nextInt();
			
			Frame frame = null;
						
			if (selected == 1) {
				//일반몹 
				
				
			} else if (selected == 2) {
				//보스몹
				
			} else if (selected == 3) {
				frame = new MonsFrame();
			} else if (selected == 4) {
				frame = new BossFrame();
			} else if (selected == 9) {
				System.out.println("종료");
				break;
			}
			frame.run();
		}
	
	}
}

