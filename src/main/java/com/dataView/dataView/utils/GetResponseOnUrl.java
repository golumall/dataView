package com.dataView.dataView.utils;

import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.MalformedURLException;


@Component
public class GetResponseOnUrl {
    public String getResponsefromTextUrl(String textUrl)
    {
        try {
            String res = Jsoup.connect(textUrl).get().html();
            return res;
        } catch (MalformedURLException mue) {

            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return "Something went wrong";
    }
}
