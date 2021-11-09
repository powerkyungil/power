package monster;

import java.util.List;

public interface MonsDAO {
	//전체조회
	List<Monster> selectAll();
	
	//단건조회
	Monster selectOne(String monsterName);
	
	//등록
	void insert(Monster mons);
	
	//수정 : department_name
	void update(Monster mons);

	//삭제
	void delete(String monsterName);
	
	
	
	
	
}
