package com.dataView.dataView.validator;

import com.dataView.dataView.model.TextUrl;
import org.apache.commons.validator.routines.UrlValidator;

public class TextUrlValidator {

    public boolean validateUrlRequest(TextUrl request)
    {
        if(urlValidator(request.getTextUrl()))
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
