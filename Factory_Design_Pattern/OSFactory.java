package design_patterns.Factory_Design_Pattern;

import design_patterns.Factory_Design_Pattern.os_package.AndroidOS;
import design_patterns.Factory_Design_Pattern.os_package.IOS;
import design_patterns.Factory_Design_Pattern.os_package.OS;
import design_patterns.Factory_Design_Pattern.os_package.WindowsOS;

public class OSFactory {
    public OS getInstance(String type) {
        switch(type) {
            case "Android":
                return new AndroidOS();
            case "IOS":
                return new IOS();
            case "Windows":
                return new WindowsOS();
            default:
                return null;
        }
    }
}
