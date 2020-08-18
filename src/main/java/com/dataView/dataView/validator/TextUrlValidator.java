package com.dataView.dataView.validator;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TextUrlValidator {

    public boolean validateUrlRequest(String request)
    {
        if(urlValidator(request))
            return true;
        return false;
    }
    public static boolean urlValidator(String url)
    {
        // Get an UrlValidator using default schemes
        UrlValidator defaultValidator = new UrlValidator();
        return defaultValidator.isValid(url);
    }
}
