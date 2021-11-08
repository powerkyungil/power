package com.yedam.app.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class EmplDAOImpl extends DAO implements EmplDAO {
	
	// 싱글톤
		private static EmplDAO instance = new EmplDAOImpl();
		
		public static EmplDAO getInstance() {
			return instance;
		}
	
		@Override
		public List<Employees> selectAll() {
			//전체조회
			List<Employees> list = new ArrayList<>();
			try {
				
				connect();
				
				stmt = conn.createStatement();
				String sql = "select * from employees order by salary";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					Employees empl = new Employees();
					empl.setEmployeeId(rs.getInt("employee_id"));
					empl.setFirstName(rs.getNString("First_name"));
					empl.setLastName(rs.getString("last_name"));
					empl.setEmail(rs.getNString("email"));
					empl.setPhoneNunber(rs.getString("phone_Number"));
					empl.setHireDate(rs.getDate("hire_date"));
					empl.setJobId(rs.getString("job_id"));
					empl.setSalary(rs.getInt("salary"));
					empl.setCommissionPct(rs.getDouble("commission_pct"));
					empl.setManagerId(rs.getInt("manager_id"));
					empl.setDepartmentId(rs.getInt("departments_id"));
					
					list.add(empl);
					
				}
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return list;
		}

		@Override
		public Employees selectOne(int EmployeeId) {
			// 단건조회
			Employees empl = null;
			try {
				stmt = conn.createStatement();
				String sql = "select * from Employees where salary =" + EmployeeId;
				rs = stmt.executeQuery(sql);
				if(rs.next()) {
					empl = new Employees();
					empl.setEmployeeId(rs.getInt("employee_id"));
					empl.setFirstName(rs.getNString("First_name"));
					empl.setLastName(rs.getString("last_name"));
					empl.setEmail(rs.getNString("email"));
					empl.setPhoneNunber(rs.getString("phone_Number"));
					empl.setHireDate(rs.getDate("hire_date"));
					empl.setJobId(rs.getString("job_id"));
					empl.setSalary(rs.getInt("salary"));
					empl.setCommissionPct(rs.getDouble("commission_pct"));
					empl.setManagerId(rs.getInt("manager_id"));
					empl.setDepartmentId(rs.getInt("departments_id"));
					
				}
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return empl;
		}

		@Override
		public void insert(Employees empl) {
			// 등록
			try {
				connect();
				String sql = "insert into employees" + " (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, empl.getEmployeeId());
				pstmt.setString(2, empl.getFirstName());
				pstmt.setString(3, empl.getLastName());
				pstmt.setString(4, empl.getEmail());
				pstmt.setString(5, empl.getPhoneNunber());
				pstmt.setDate(6, empl.getHireDate());
				pstmt.setString(7, empl.getJobId());
				pstmt.setInt(8, empl.getSalary());
				pstmt.setDouble(9, empl.getCommissionPct());
				pstmt.setInt(10, empl.getManagerId());
				pstmt.setInt(11, empl.getDepartmentId());
				
				int result = pstmt.executeUpdate();
				System.out.println(result + "건 등록완료");
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			
		}

		@Override
		public void update(Employees empl) {
			// 수정 : salary
			try {
				
				connect();
				
				String sql = "update employees set salary = ? where salary = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, empl.getEmployeeId());
				pstmt.setString(2, empl.getFirstName());
				pstmt.setString(3, empl.getLastName());
				pstmt.setString(4, empl.getEmail());
				pstmt.setString(5, empl.getPhoneNunber());
				pstmt.setDate(6, empl.getHireDate());
				pstmt.setString(7, empl.getJobId());
				pstmt.setInt(8, empl.getSalary());
				pstmt.setDouble(9, empl.getCommissionPct());
				pstmt.setInt(10, empl.getManagerId());
				pstmt.setInt(11, empl.getDepartmentId());
				
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			
		}

		@Override
		public void delete(int EmployeeId) {
			//삭제
			try {
				connect();
				stmt = conn.createStatement();
				String sql = "delete from employees where salary" + EmployeeId;
				int result = stmt.executeUpdate(sql);
				System.out.println(result + "건 삭제완료");
				
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			
		}
	

}
