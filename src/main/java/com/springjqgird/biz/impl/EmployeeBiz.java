package com.springjqgird.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springjqgird.biz.IEmployeeBiz;
import com.springjqgird.dao.EmployeeDao;
import com.springjqgird.vo.EmployeeVo;

@Component("iEmployeeBiz")
public class EmployeeBiz implements IEmployeeBiz {
   
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<EmployeeVo> getAll() {
		try {
			return employeeDao.getAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<EmployeeVo> searchName(String name) {
		// TODO Auto-generated method stub
		try {
			return employeeDao.searchName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean insert(EmployeeVo emp) {
		// TODO Auto-generated method stub
		try {
			return employeeDao.insert(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		try {
			return employeeDao.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(EmployeeVo emp) {
		// TODO Auto-generated method stub
		try {
			return employeeDao.update(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public EmployeeVo getById(String id) {
		// TODO Auto-generated method stub
		try {
			return employeeDao.getById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;

		}
	}
   
}
