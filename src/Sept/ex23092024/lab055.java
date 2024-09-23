package Sept.ex23092024;

public class lab055 {
    public static void main(String[] args) {
        // Web Automation // which browser to run
        // chrome  - chrome driver
        // firefox - execute firefox
        // edge - edge cases

        String browser = "opera";

        switch (browser) {
            default:
                System.out.println("I have not idea which browser is this");
                break;
            case "chrome":
                System.out.println("Starting the chrome browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;

        }
    }
}
