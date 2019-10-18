package com.web.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.web.demo.Model.Employee;
import com.web.demo.Repository.EmployeeRepository;
import com.web.demo.Service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;
	
	@RequestMapping("/search")
		public ModelAndView homePageHandler(@RequestParam("key")String key)
	{
		ModelAndView mv = new ModelAndView();
		List<Employee> list = repo.findBySearchKey(key);
		mv.addObject("emp", list);
		mv.setViewName("display");
		return mv;
	}
	

}
