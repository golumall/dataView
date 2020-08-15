package com.dataView.dataView.service;

import com.dataView.dataView.model.UserLogin;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final static Logger logger= LogManager.getLogger(UsersService.class);

    @Autowired
    UserLoginRepository userLoginRepository;

    public String verifyUserLogin(String userName,String password)
    {
        try
        {
            logger.info("Going to verify Login Credentials with userName: "+userName);
            UserLogin userLogin=userLoginRepository.findByUser_nameAndPassword(userName, password);
            logger.info("Fetched Data: "+userLogin);
            System.out.print("User Login: "+userLogin.getUser_name()+"\nPassword="+userLogin.getPassword());
            if(null!=userLogin)
                 return "success";

        }
        catch (Exception e)
        {
            logger.info("Got An excetion during login");
        }
        return "fail";
    }

}
