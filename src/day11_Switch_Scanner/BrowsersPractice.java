package day11_Switch_Scanner;

public class BrowsersPractice {

    public static void main(String[] args) {

        String browserName = "chrome";
        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox"
                || browserName == "safari" || browserName == "opera" ||
                browserName == "edge";

        if (validBrowser) {

        if (browserName == "chrome") {
            result = " Selected Browser Name Is chrome";
        } else if (browserName == "firefox") {
            result = " Selected Browser Name Is firefox";
        } else if (browserName == "safari") {
            result = " Selected Browser Name Is safari";

        } else {
            result = " Selected Browser Name Is edge";
        }
        } else {
        result = " Invalid Browser Name";
        }
        System.out.println(result);
    }
}
