package app;

import java.util.List;
import java.util.Scanner;

import boss.Boss;
import boss.BossDAO;
import boss.BossDAOImpl;
import common.Frame;
import monster.Monster;

public class BossFrame implements Frame {
	// 필드
	Scanner scanner = new Scanner(System.in);
	BossDAO dao = BossDAOImpl.getInstance();

	// 생성자

	// 메소드
	public void run() {
		// 메뉴를 출력하고 메뉴를 선택해서 해당 기능을 호출
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 등록
				insertBos();
			} else if (menuNo == 2) { // 수정
				updateBos();
			} else if (menuNo == 3) { // 삭제
				deleteBos();
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
		System.out.println("=========================================================");
		System.out.println("==1.등록 2.수정 3.삭제 4.보스몬스터조회 5.전체보스몬스터조회 9.종료==");
		System.out.println("=========================================================");
		System.out.println("선택>>");
	}

	// 메뉴를 선택하는 메소드
	int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("보스몬스터가 존재하지 않습니다.");
		}
		return menuNo;
	}

	// 공통된 기능 - 입력
	Boss inputAll() {
		Boss bos = new Boss();
		System.out.println("보스몬스터네임>> ");
		bos.setBossName(scanner.next());
		System.out.println("보스몬스터HP>> ");
		bos.setBossHp(scanner.nextInt());
		System.out.println("보스몬스터공격력>> ");
		bos.setBossPower(scanner.nextInt());

		return bos;
	}

	String inputBosName() {
		String BossName = null;
		System.out.println("보스몬스터네임>>");
		BossName = scanner.next();
		return BossName;
	}

	// 각 기능마다 메소드
	// - 종료
	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	// - 전체조회
	void selectAll() {
		List<Boss> list = dao.selectAll();
		for (Boss bos : list) {
			System.out.println(bos);
		}
	}

	// - 단건조회
	void selectOne() {
		String bossName = inputBosName();
		Boss bos = dao.selectOne(bossName);
		System.out.println(bos);
	}

	// - 입력
	void insertBos() {
		Boss bos = inputAll();
		dao.insert(bos);
	}

	// - 수정
	void updateBos() {
		Boss bos = inputAll();
		dao.update(bos);
	}

	// - 삭제
	void deleteBos() {
		String bossName = inputBosName();
		dao.delete(bossName);
	}

}
