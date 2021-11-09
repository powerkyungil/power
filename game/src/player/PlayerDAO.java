package player;

import java.util.List;

public interface PlayerDAO {
	//전체조회
	List<Player> selectAll();
	
	//단건조회
	Player selectOne(String playerName);
	
	//등록
	void insert(Player play);
	
	//수정 : department_name
	void update(Player play);
	
	//삭제
	void delete(String playerName);
	
	
}
