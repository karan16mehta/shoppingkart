package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	private HttpSession session;
	// http://localhost:
@RequestMapping("/")
public ModelAndView showhomepage(){
	// specifying which page you have navigation
	ModelAndView mv = new ModelAndView("/Home");
// specify what data you have to carry to home page
	mv.addObject("msg","welcome to shoping cart");
	 return mv;
	}

// <a href = "/login"> login here</>

@RequestMapping("/login")
public ModelAndView showLoginPage()
{ 
	
	ModelAndView mv = new ModelAndView("/Home");
	mv.addObject("isUserClickedLogin","true");
			return mv;
	
	}

@RequestMapping ("/register")
public ModelAndView Register()
{ 
	
	ModelAndView mv = new ModelAndView("/Home");
	mv.addObject("isUserClickedRegister","true");
			return mv;
	
}


@PostMapping ("/validate")      // removed @RequestMapping bcz in login.jsp we have given method post form action.
public ModelAndView validateCredentials(@RequestParam("UserID") String id,
		@RequestParam("password") String pwd)
{ 
	
// Actually we have to get the data from DB
	// temporarily user niit pass= niit@123
	
	ModelAndView mv = new ModelAndView("/Home");
	
	if (id.equals("niit")  && pwd.equals("niit@123")){
		
		
		mv.addObject("successMessage","valid credentials");
	session.setAttribute("logginMessage", "welcome:"+ id);
	
	
	}
	
	else{
		
		
		mv.addObject("errorMessage", "InValid Credentials... pls try again");
	}
	
	return mv;
}

	@RequestMapping("/logout")
	public ModelAndView logout(){
		ModelAndView mv = new ModelAndView("/Home");
		session.removeAttribute("logginMessage");
		return mv;
		
		
	}
}


