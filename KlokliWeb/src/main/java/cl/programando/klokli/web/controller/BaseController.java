package cl.programando.klokli.web.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/web",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class BaseController{

	private static final Logger logger = Logger.getLogger(BaseController.class);
	    	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String configure(Model model){
		
		model.addAttribute("message", "");
	    return "dashboard";
				
	}
	
	@RequestMapping(value = "/rest", method = RequestMethod.GET)
	public @ResponseBody Employee getDummyEmployee() {
		logger.info("Start getDummyEmployee");
		Employee emp = new Employee();
		emp.setId(9999);
		emp.setName("Dummy");
		emp.setCreatedDate(new Date());
		return emp;
	}
	
	
}