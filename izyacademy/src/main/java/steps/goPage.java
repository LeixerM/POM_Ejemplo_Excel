package steps;

import Driver.GoogleChromeDriver;

public class goPage {

    public static void opBrowser (String url){
        GoogleChromeDriver.ChromeDriver(url);
    }
}
