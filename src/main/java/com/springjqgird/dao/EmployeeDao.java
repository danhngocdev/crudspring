package com.springjqgird.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springjqgird.vo.EmployeeVo;

@Repository
public class EmployeeDao  {

	
	
//	private static EmployeeDao instance;
	
	private  SqlSessionFactory factory;
	
	@Autowired
	private DataSource ds;
	
	public EmployeeDao(){
		
	}
	
	private void initSessionFactory() {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(ds);
		try {
			this.factory = factoryBean.getObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	public static EmployeeDao getInstance() {
//		if (instance == null)
//			instance = new EmployeeDao();
//		return instance;
//	}
	
	
	public List<EmployeeVo> getAll()  {
		initSessionFactory();
		 SqlSession session = factory.openSession();
		 List<EmployeeVo> emplist = session.selectList("getAll");
		 session.commit();
		 session.close();
		 return emplist;
		
	}
	    public List<EmployeeVo> searchName(String name)  {
	        SqlSession session = factory.openSession();
	        List<EmployeeVo> accounts = session.selectList("EmployeeMapper.searchName",name);
	        session.close();
	        return accounts;
	    }
	
	public EmployeeVo getById(String id){
		 SqlSession session = factory.openSession();
		 EmployeeVo employee = session.selectOne("EmployeeMapper.getById",id);
		 session.close();
		 return employee;
		 
	}
	public boolean insert(EmployeeVo emp) {
		boolean check = false;
		SqlSession session = factory.openSession();
		try {
			
			session.insert("EmployeeMapper.insert", emp);
			 session.commit();
			 check = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			check =false;
		}finally {
			session.close();
		}
		return check;
	}
	public boolean delete(String id) {
		boolean check = false;
		SqlSession session = factory.openSession();
		try {
			
			session.delete("EmployeeMapper.delete",id);
			 session.commit();
			 check = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			check =false;
		}finally {
			session.close();
		}
		return check;
			
	}
	public boolean update(EmployeeVo emp) {
		boolean check = false;
		SqlSession session = factory.openSession();
		try {
			
			session.update("EmployeeMapper.update", emp);
			 session.commit();
			 check = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			check =false;
		}finally {
			session.close();
		}
		return check;
	}

}
