package com.jspider.ContactBook;

import java.util.List;

import org.apache.taglibs.standard.lang.jstl.DivideOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
	@Autowired
	   MyContactsDao dao;
	@RequestMapping("/addcontact")
	public ModelAndView addcontact() {
	    ModelAndView mav =new ModelAndView("addcontact.jsp")	;
	    Mycontacts mc =new Mycontacts();
	    mav.addObject("contact", mc);
	    return mav;
	}
	@RequestMapping("/savecontact")
	public ModelAndView savecontact(@ModelAttribute Mycontacts mc) {
	    ModelAndView mav =new ModelAndView("Menu.jsp")	;
        dao.savecontact(mc);
        return mav;
	}
	@RequestMapping("/viewall")
	public ModelAndView getAllcontact() {
		ModelAndView modelAndView =new ModelAndView("viewall.jsp");
		List<Mycontacts> c=dao.getAllContacts();
		return modelAndView.addObject("contact",c);
		
	}
	}
