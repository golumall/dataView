package com.dataView.dataView.service;

import com.dataView.dataView.utils.GetResponseOnUrl;
import com.dataView.dataView.validator.TextUrlValidator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TextUrlResponseService {

    private final static Logger logger= LogManager.getLogger(TextUrlResponseService.class);
    @Autowired
    GetResponseOnUrl getResponseOnUrl;
    @Autowired
    TextUrlValidator textUrlValidator;

    public String calculateResponseOnTextUrl(String textUrl)
    {
        logger.info("Going to validate URL: "+textUrl);
        if(!textUrlValidator.validateUrlRequest(textUrl))
            return "Invalid URL";
        logger.info("Validation Successful");
       return  getResponseOnUrl.getResponsefromTextUrl(textUrl);
    }
}
