package com.dataView.dataView.service;

import com.dataView.dataView.model.TextUrlData;
import com.dataView.dataView.utils.GetResponseOnUrl;
import com.dataView.dataView.validator.TextUrlValidator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;


@Service
public class TextUrlResponseService {

    private final static Logger logger= LogManager.getLogger(TextUrlResponseService.class);
    @Autowired
    GetResponseOnUrl getResponseOnUrl;

    @Autowired
    TextUrlValidator textUrlValidator;

    @Autowired
    FindUrlResponseData findUrlResponseData;

    @Autowired
    SaveUrlResponseData saveUrlResponseData;

    public String calculateResponseOnTextUrl(String textUrl) throws Exception
    {
        logger.info("Going to validate URL: "+textUrl);
        if(!textUrlValidator.validateUrlRequest(textUrl))
            return "Invalid URL";
        logger.info("Validation Successful");
        String res=getResponseOnUrl.getResponsefromTextUrl(textUrl);
        TextUrlData textUrlData=findUrlResponseData.findByUrl(textUrl);
        byte [] blobArray=res.getBytes();
        //Blob blob= Hibernate.getLobCreator().createClob(res);
        Blob blob=new SerialBlob(blobArray);
          if(res.length()!=0&&null==textUrlData)
              saveUrlResponseData.saveUrlResponse(textUrl, blob);
       return  res;
    }
}
