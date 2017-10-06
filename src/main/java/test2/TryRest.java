package test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TryRest {

	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	public String test(){
		return "This is an openshift test";
	}
	
}
