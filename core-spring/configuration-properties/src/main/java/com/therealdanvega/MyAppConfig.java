package com.therealdanvega;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//setting the application location to myConfig.yml 
//it will refer to .yml because application.properties file is empty
//so the preference will be given to yml file

//by setting this we dont have to use @value() for each variable
//spring will directly refer to myconfig.yml file and variables within them

@ConfigurationProperties(prefix = "myconfig")
public class MyAppConfig {

   
	private String appName;
    private String appDescription;
    private String adminFirstName;
    private String adminLastName;
    private String adminEmail;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "MyAppConfig{" +
                "appName='" + appName + '\'' +
                ", appDescription='" + appDescription + '\'' +
                ", adminFirstName='" + adminFirstName + '\'' +
                ", adminLastName='" + adminLastName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                '}';
    }
}
