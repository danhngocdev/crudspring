package com.springjqgird.biz;

import java.util.List;

import com.springjqgird.vo.EmployeeVo;


public interface IEmployeeBiz {
	
      public List<EmployeeVo> getAll();
      
	  public List<EmployeeVo> searchName(String name);
	  
	  public boolean insert(EmployeeVo emp);
	  
	  public boolean delete(String id);
	  
	  public boolean update(EmployeeVo emp);
	  
	  public EmployeeVo getById(String id);
}
