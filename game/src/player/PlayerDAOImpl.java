package player;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DAO;


public class PlayerDAOImpl extends DAO implements PlayerDAO {
	//싱글톤
		private static PlayerDAO instance = new PlayerDAOImpl();
		
		public static PlayerDAO getInstance() {
			return instance;
		}

	@Override
	public List<Player> selectAll() {
		//전체 조회
		List<Player> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "select * from player order by player_name";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Player play = new Player();
				play.setPlayerName(rs.getString("player_name"));
				play.setPlayerHp(rs.getInt("player_hp"));
				play.setPlayerPower(rs.getInt("player_power"));
				
				list.add(play);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Player selectOne(String PlayerName) {
		//단건조회
		Player play = null;
		try {
			connect();
			
			stmt = conn.createStatement();
			String sql = "select * from player where player_name =" + PlayerName;
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				play = new Player();
				play.setPlayerName(rs.getString("player_name"));
				play.setPlayerHp(rs.getInt("player_hp"));
				play.setPlayerPower(rs.getInt("player_power"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return play;
	}

	@Override
	public void insert(Player play) {
		//등록
		try {
			connect();
			
			String sql = "insert into monsters" + " (monster_name, monster_hp, monster_power)" + " values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, play.getPlayerName());
			pstmt.setInt(2, play.getPlayerHp());
			pstmt.setInt(3, play.getPlayerPower());
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"건 등록완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
	}
	@Override
	public void update(Player play) {
		//수정 : player_name
		try {
			connect();
			
			String sql = "update player set player_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, play.getPlayerName());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건 수정완료");
						
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
	}

	}

	@Override
	public void delete(String playerName) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "delete from player where player_id =" + playerName;
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "건 삭제완료");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

}
