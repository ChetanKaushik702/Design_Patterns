package design_patterns.Factory_Design_Pattern;

import design_patterns.Factory_Design_Pattern.os_package.OS;

public class Main {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("IOS");
        os.spec();
    }
}
