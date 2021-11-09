package boss;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DAO;

public class BossDAOImpl extends DAO implements BossDAO {
	//싱글톤
			private static BossDAO instance = new BossDAOImpl();
			
			public static BossDAO getInstance() {
				return instance;
			}

		@Override
		public List<Boss> selectAll() {
			//전체 조회
			List<Boss> list = new ArrayList<>();
			try {
				connect();
				stmt = conn.createStatement();
				String sql = "select * from monster order by boss_name";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					Boss bos = new Boss();
					bos.setBossName(rs.getString("Boss_name"));
					bos.setBossHp(rs.getInt("Boss_hp"));
					bos.setBossPower(rs.getInt("Boss_power"));
					
					list.add(bos);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return list;
		}

		@Override
		public Boss selectOne(String BossName) {
			//단건조회
			Boss mons = null;
			try {
				connect();
				
				stmt = conn.createStatement();
				String sql = "select * from monster where monster_name =" + BossName;
				rs = stmt.executeQuery(sql);
				if(rs.next()) {
					mons = new Boss();
					mons.setBossName(rs.getString("boss_name"));
					mons.setBossHp(rs.getInt("boss_hp"));
					mons.setBossPower(rs.getInt("boss_power"));
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return mons;
		}

		@Override
		public void insert(Boss bos) {
			//등록
			try {
				connect();
				
				String sql = "insert into Boss" + " (Boss_name, Boss_hp, Boss_power)" + " values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bos.getBossName());
				pstmt.setInt(2, bos.getBossHp());
				pstmt.setInt(3, bos.getBossPower());
				
				int result = pstmt.executeUpdate();
				System.out.println(result +"건 등록완료");
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				disconnect();

			}
		}
		@Override
		public void update(Boss bos) {
			//수정 : boss_name
			try {
				connect();
				
				String sql = "update Boss set Boss_name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bos.getBossName());
				
				int result = pstmt.executeUpdate();
				System.out.println(result + "건 수정완료");
							
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				disconnect();
		}

		}

		@Override
		public void delete(String bossName) {
			try {
				connect();
				stmt = conn.createStatement();
				String sql = "delete from boss where boss_id =" + bossName;
				int result = stmt.executeUpdate(sql);
				System.out.println(result + "건 삭제완료");
				
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
		}

}
