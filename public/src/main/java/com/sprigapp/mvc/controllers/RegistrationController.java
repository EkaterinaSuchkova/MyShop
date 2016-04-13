package com.sprigapp.mvc.controllers;

import com.sprigapp.mvc.form.RegistrationFormBean;
import com.springapp.mvc.common.AddressInfo;
import com.springapp.mvc.common.UserInfo;
import com.springapp.mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Катя on 09.04.2016.
 */
@Controller
@RequestMapping("/reg")
public class RegistrationController {


    public static final String ATTR_REGISTRATION_FORM = "regForm";

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;

    /**
     * Отображение страницы регистрации
     */
    @RequestMapping(method = RequestMethod.GET)
    public String renderRegistrationPage() {
        request.setAttribute(ATTR_REGISTRATION_FORM, new RegistrationFormBean());
        return "registrtion/registration";
    }

    /**
     * Обработка формы Регистрации
     */
    @RequestMapping(method = RequestMethod.POST)
    public String registrationForm(
            @Valid @ModelAttribute(ATTR_REGISTRATION_FORM) RegistrationFormBean registrationFormBean,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registrtion/registration";
        }
        userService.add(new UserInfo(registrationFormBean.getFirstName().concat(" ").concat(registrationFormBean.getLastName()),
                registrationFormBean.getEmail(),registrationFormBean.getEmail(),DigestUtils.md5DigestAsHex(registrationFormBean.getPassword().getBytes()),false,"ROLE_USER",
                new AddressInfo(1L)));
        System.out.println(registrationFormBean);
        return "login/login";
    }


}
