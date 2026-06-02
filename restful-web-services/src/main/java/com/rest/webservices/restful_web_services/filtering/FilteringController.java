package com.rest.webservices.restful_web_services.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	
	@GetMapping("/filtering-List")
	public List<SomeBean> FilteringList() {
		return Arrays.asList(new SomeBean("value1", "value2", "value3"),
				new SomeBean("value4","value5","value6"));
	}

}
