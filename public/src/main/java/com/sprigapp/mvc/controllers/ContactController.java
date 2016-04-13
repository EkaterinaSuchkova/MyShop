package com.sprigapp.mvc.controllers;

import com.sprigapp.mvc.form.ContactFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by  ат€ on 08.04.2016.
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private HttpServletRequest request;

    public static final String ATTR_CONTACT_FORM = "contactForm";
    /**
     * –ендеринг формы обратнойсв€зи
     */
    @RequestMapping(method = RequestMethod.GET)
    public String renderOrderForm(){
        request.setAttribute(ATTR_CONTACT_FORM, new ContactFormBean());
        return "contact/contact";
    }
    /**
     * ќбработка формы обратной св€зи
     */
    @RequestMapping(method = RequestMethod.POST)
    public String contactForm(
            @Valid @ModelAttribute(ATTR_CONTACT_FORM) ContactFormBean contactFormBean,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "contact/contact";
        }
        // здесь должно происходить занесение жалобы текущего пользовател€ в базу
        System.out.println(contactFormBean);
        return "contact/successContact";
    }


}
