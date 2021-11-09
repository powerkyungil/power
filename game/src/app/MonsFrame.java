package app;

import java.util.List;
import java.util.Scanner;
import common.Frame;
import monster.MonsDAO;
import monster.MonsDAOImpl;
import monster.Monster;


public class MonsFrame implements Frame {
	//필드
	Scanner scanner = new Scanner(System.in);
	MonsDAO dao = MonsDAOImpl.getInstance();
	
	
	//생성자
	
	//메소드
	public void run() {
		// 메뉴를 출력하고 메뉴를 선택해서 해당 기능을 호출
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 등록
				insertMons();
			} else if (menuNo == 2) { // 수정
				updateMons();
			} else if (menuNo == 3) { // 삭제
				deleteMons();
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
			System.out.println("===================================================");
			System.out.println("==1.등록 2.수정 3.삭제 4.몬스터조회 5.전체몬스터조회 9.종료==");
			System.out.println("===================================================");
			System.out.println("선택>>");
		}
		// 메뉴를 선택하는 메소드
		int menuSelect() {
			int menuNo = 0;
			try {
				menuNo = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("몬스터가 존재하지 않습니다.");
			}
			return menuNo;
		}
		// 공통된 기능 - 입력
		Monster inputAll() {
			Monster mons = new Monster();
			System.out.println("몬스터네임>> ");
			mons.setMonsterName(scanner.next());
			System.out.println("몬스터HP>> ");
			mons.setMonsterHp(scanner.nextInt());
			System.out.println("몬스터공격력>> ");
			mons.setMonsterPower(scanner.nextInt());
			
			return mons;
		}
		
		String inputMonsName() {
			String monsterName = null;
			System.out.println("몬스터네임>>");
			monsterName = scanner.next();
			return monsterName;
		}
		
		// 각 기능마다 메소드
		// - 종료
		void end() {
			System.out.println("프로그램을 종료합니다.");
		}

		// - 전체조회
		void selectAll() {
			List<Monster> list = dao.selectAll();
			for (Monster mons : list) {
				System.out.println(mons);
				/*int index = 0;
				for (Boss bos : list) {
					if(bos.getBossName().equals("보스네임"))
						
					System.out.println(bos);
				}
				for(int i =0; i<list.size(); i++) {
					if(list.get(i).getBossName().equals("보스네임")){
						index = i;
						break;
					}*/
				
			}
		}

		// - 단건조회
		void selectOne() {
			String monsterName = inputMonsName();
			Monster mons = dao.selectOne(monsterName);
			System.out.println(mons);
		}
		
		// - 입력
		void insertMons() {
			Monster mons = inputAll();
			dao.insert(mons);
		}
		
		// - 수정
		void updateMons() {
			Monster mons = inputAll();
			dao.update(mons);
		}
		// - 삭제
		void deleteMons() {
			String monsterName = inputMonsName();
			dao.delete(monsterName);
		}

}
