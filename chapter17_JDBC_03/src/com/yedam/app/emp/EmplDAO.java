package com.yedam.app.emp;

import java.util.List;

public interface EmplDAO {
	// 전체조회
		List<Employees> selectAll();
		
		// 단건조회
		Employees selectOne(int EmployeeId);
		
		// 등록
		void insert(Employees dpet);
		
		// 수정 : employee_salary
		void update(Employees dpet);
		
		// 삭제
		void delete(int EmployeeId);
}
