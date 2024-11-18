package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@ResponseBody
	@RequestMapping("/getStudentData")
	public Student getData() {
		return new Student( 10, "Reva");
	}
	
}
