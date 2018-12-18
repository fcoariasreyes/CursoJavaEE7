package cl.programando.klokli.web.controller.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public interface OracleEloquaAppCloudActionService<T> {

	@RequestMapping(value = "/create/{instanceId}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<T> create(@PathVariable("instanceId") String instanceId) ;
}
