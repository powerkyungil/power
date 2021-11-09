package app;

import java.util.List;
import java.util.Scanner;

import boss.Boss;
import common.Frame;
import monster.Monster;
import player.Player;
import player.PlayerDAO;
import player.PlayerDAOImpl;


public class PlayerFrame implements Frame {
		//필드
		Scanner scanner = new Scanner(System.in);
		PlayerDAO dao = PlayerDAOImpl.getInstance();
		
		
		//생성자
		
		//메소드
		public void run() {
			// 메뉴를 출력하고 메뉴를 선택해서 해당 기능을 호출
			while (true) {
				menuPrint();
				int menuNo = menuSelect();

				if (menuNo == 1) { // 등록
					insertPlay();
				} else if (menuNo == 2) { // 수정
					updatePlay();
				} else if (menuNo == 3) { // 삭제
					deletePlay();
				} else if (menuNo == 4) { // 단건조회
					selectOne();
				} else if (menuNo == 5) { // 전체조회
					selectAll();
				} else if (menuNo == 9) { // 종료
					end();
					break;
				}
			}
		}
		// 메뉴를 출력하는 메소드
			void menuPrint() {
				System.out.println("");
				System.out.println("======================================================");
				System.out.println("==1.등록 2.수정 3.삭제 4.플레이어조회 5.전체플레이어조회 9.종료==");
				System.out.println("======================================================");
				System.out.println("선택>>");
			}
			// 메뉴를 선택하는 메소드
			int menuSelect() {
				int menuNo = 0;
				try {
					menuNo = scanner.nextInt();
				} catch (Exception e) {
					System.out.println("플레이어가 존재하지 않습니다.");
				}
				return menuNo;
			}
			// 공통된 기능 - 입력
			Player inputAll() {
				Player play = new Player();
				System.out.println("플레이어네임>> ");
				play.setPlayerName(scanner.next());
				System.out.println("플레이어HP>> ");
				play.setPlayerHp(scanner.nextInt());
				System.out.println("플레이어공격력>> ");
				play.setPlayerPower(scanner.nextInt());
				
				return play;
			}
			
			String inputPlayName() {
				String playerName = null;
				System.out.println("플레이어네임>>");
				playerName = scanner.next();
				return playerName;
			}
			
			// 각 기능마다 메소드
			// - 종료
			void end() {
				System.out.println("프로그램을 종료합니다.");
			}

			// - 전체조회
			void selectAll() {
				List<Player> list = dao.selectAll();
				for (Player play : list) {
					System.out.println(play);
					}
			}	
			// - 단건조회
			void selectOne() {
				String playerName = inputPlayName();
				Player play = dao.selectOne(playerName);
				System.out.println(play);
			}
			
			// - 입력
			void insertPlay() {
				Player play = inputAll();
				dao.insert(play);
			}
			
			// - 수정
			void updatePlay() {
				Player play = inputAll();
				dao.update(play);
			}
			// - 삭제
			void deletePlay() {
				String playerName = inputPlayName();
				dao.delete(playerName);
			}
}
