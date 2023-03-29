package smallJavaProject;

import java.awt.*;
import java.net.URI;

public class OpenAmazonBrowserWithJava {




        public static void main(String[] args) {
            try {

                Desktop.getDesktop().browse(new URI("https://www.amazon.com"));
            } catch (Exception e) {
                e.printStackTrace();
            }}}



