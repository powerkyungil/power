package monster;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DAO;


public class MonsDAOImpl extends DAO implements MonsDAO {
	//싱글톤
		private static MonsDAO instance = new MonsDAOImpl();
		
		public static MonsDAO getInstance() {
			return instance;
		}

	@Override
	public List<Monster> selectAll() {
		//전체 조회
		List<Monster> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "select * from monster order by monster_name";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Monster mons = new Monster();
				mons.setMonsterName(rs.getString("monster_name"));
				mons.setMonsterHp(rs.getInt("monster_hp"));
				mons.setMonsterPower(rs.getInt("monster_power"));
				
				list.add(mons);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Monster selectOne(String MonsterName) {
		//단건조회
		Monster mons = null;
		try {
			connect();
			
			stmt = conn.createStatement();
			String sql = "select * from monster where monster_name =" + MonsterName;
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				mons = new Monster();
				mons.setMonsterName(rs.getString("monster_name"));
				mons.setMonsterHp(rs.getInt("monster_hp"));
				mons.setMonsterPower(rs.getInt("monster_power"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return mons;
	}

	@Override
	public void insert(Monster mons) {
		//등록
		try {
			connect();
			
			String sql = "insert into monsters" + " (monster_name, monster_hp, monster_power)" + " values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mons.getMonsterName());
			pstmt.setInt(2, mons.getMonsterHp());
			pstmt.setInt(3, mons.getMonsterPower());
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"건 등록완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
	}
	@Override
	public void update(Monster mons) {
		//수정 : monster_name
		try {
			connect();
			
			String sql = "update monster set monster_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mons.getMonsterName());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건 수정완료");
						
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
	}

	}

	@Override
	public void delete(String monsterName) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "delete from monster where monster_id =" + monsterName;
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "건 삭제완료");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

}
