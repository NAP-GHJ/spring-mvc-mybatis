package main.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import main.domain.User;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private static List<User> userList;
    private static final Log logger = LogFactory.getLog(UserController.class);

    public UserController(){
        super();
        userList = new ArrayList<User>();
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm(){
        logger.info("UserController Handle Register Get");
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            @RequestParam("username") String username
    ){
        logger.info("UserController Handle Register Post");

        User user = new User();
        user.setLoginname(loginname);
        user.setUsername(username);
        user.setPassword(password);

        userList.add(user);
        return "loginForm";
    }

    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model
    ){
        logger.info("Loginname:"+loginname+"password:"+password);
        for(User user: userList){
            if(user.getLoginname().equals(loginname)
                    && user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "loginWelcome";
            }
        }
        return "loginForm";
    }
}
