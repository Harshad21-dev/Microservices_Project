package com.rest.webservices.restful_web_services.helloHarshad;




import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHarshadController {
	private MessageSource messageSource;
    public HelloHarshadController(MessageSource messageSource) {
    	this.messageSource= messageSource;
    }
	@GetMapping( path = "/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}
	
   @GetMapping(path="/hello-world-bean")
	   public HelloworldBean HelloWorldBean() {
		   return new HelloworldBean("Hello World","Harshad");
	   }
   
   @GetMapping(path="/hello-world/path-variable/{name}")
   public HelloworldBean HelloWorldPathVariable(@PathVariable String name) {
	   return new HelloworldBean( String.format("Hello World,  %s", name), name);
       }
   
	@GetMapping( path = "/hello-world/internationalized")
	public String HelloWorldInternationalized() {
		Locale locale= LocaleContextHolder.getLocale();
		System.out.println( " locale: " + locale);
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
		//return "Hello World";
	}
	
   }


