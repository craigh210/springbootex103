package com.cwhcode.springbootex103;
/* 
Re-test to see how pull works
*/

//Define the imports
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Use an annotation to indicate this is the controller
@Controller
public class HomeController {
    //Map the default home page to this method
	@RequestMapping("/")
    public String homePage() {
        return "hometemplate";
    }
}

