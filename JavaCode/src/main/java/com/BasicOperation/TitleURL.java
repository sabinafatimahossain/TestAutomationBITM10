package com.BasicOperation;

import com.Base.BaseClass;

public class TitleURL extends BaseClass {

    public static Object title;

    public static void main(String[] args) {
        firefox_launch();
        open_URL("https://google.com");
        title_verification("Your Store");
        URL_verification("https://demo.opencart.com/");
        firefox_close();
    }
    static void title_verification(String ExpectedTitle) {
        //String ExpectedTitle="My Store";
        String ActualTitle= driver.getTitle();
        if (ExpectedTitle.equals(ActualTitle)){
        System.out.println("Title Verification Passed");
        }
        else
            System.out.println("Title Verification Failed!!!"+"Actual Title is: "+ActualTitle);
    }
    public static void URL_verification(String ExpectedUrl) {
        //String ExpectedURL="https://demo.opencart.com/";
        String ActualURL= driver.getCurrentUrl();
        if (ExpectedUrl.equals(ActualURL)){
            System.out.println("URL Verification Passed");
        }
        else
            System.out.println("URL Verification Failed!!!"+"Actual URL is: "+ActualURL);

    }


    }
