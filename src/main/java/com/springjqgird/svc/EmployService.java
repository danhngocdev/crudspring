package com.springjqgird.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springjqgird.biz.IEmployeeBiz;
import com.springjqgird.svc.vo.EmployeeSvo;
import com.springjqgird.vo.EmployeeVo;



@RestController
@Controller
@RequestMapping("/api")
public class EmployService {

	@Autowired
	private IEmployeeBiz iEmployeeBiz;
	
	@RequestMapping(value = "/employees",method =  RequestMethod.GET)
	public EmployeeSvo getEmployeeList() {
		EmployeeSvo result = new EmployeeSvo();
		List<EmployeeVo> list = iEmployeeBiz.getAll();
		result.setEmployeeList(list);
		return result;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/getEmployee/{id}")
	public EmployeeVo getById(@RequestParam String id) {
		EmployeeVo empvo =  iEmployeeBiz.getById(id);
	    return empvo;
	}
	
	
	public EmployeeSvo getbyName(String name){
		EmployeeSvo result = new EmployeeSvo();
		List<EmployeeVo> listByName = iEmployeeBiz.getAll();
		result.setEmployeeList(listByName);
		return result;
	}
	
	public boolean delete(String id) {
		boolean check = false;
		 try {
			EmployeeVo emp = iEmployeeBiz.getById(id);
			iEmployeeBiz.delete(emp.getUser_id());
			check = true;
		} catch (Exception e) {
			e.printStackTrace();
			check = false;
		}
		
		return check;
	}
	@RequestMapping(method = RequestMethod.POST, value = "/addEmployee", consumes = "application/json")
	public boolean insert(@RequestBody EmployeeVo emp) {
	       boolean check = false;
	       try {
			iEmployeeBiz.insert(emp);
			 check = true;
		} catch (Exception e) {
			e.printStackTrace();
			check = false;
		}
	       return check;
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/updateEmployee", consumes = "application/json")
	public boolean update(@RequestBody EmployeeVo emp) {
	       boolean check = false;
	       try {
			iEmployeeBiz.update(emp);
			 check = true;
		} catch (Exception e) {
			e.printStackTrace();
			check = false;
		}
	       return check;
	}
	
	
	
	
}

