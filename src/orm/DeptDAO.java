package orm;

import java.util.List;

public interface DeptDAO {
	//宣告各個對部門表格操作的方法
	//程式裡,現在一筆部門資料就是一個dept物件
	void insert(Dept dept);//新增資料 直接使用Dept類別代表參數
	void update(Dept dept);
	void delet(Integer deptno);

	Dept findByDeptno(Integer deptno);
	//尋找部門物件藉由員工編號 所以回傳dept物件
	List<Dept> getAll(); //使用不需考慮長度的集合取出所有資料 用list(有順序性)
	
}
