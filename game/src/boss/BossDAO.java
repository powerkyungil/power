package boss;

import java.util.List;

public interface BossDAO {
	//전체조회
		List<Boss> selectAll();
		
		//단건조회
		Boss selectOne(String bossName);
		
		//등록
		void insert(Boss bos);
		
		//수정 : department_name
		void update(Boss bos);
		
		//삭제
		void delete(String bossName);
}
