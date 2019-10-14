package com.abc.foo;

import org.springframework.stereotype.Service;


//telling the spring boot that this is a service bean to be managed therefore we use,@Service annotations

//providing own bean name as  "myNotificationService" within @Service() annotations
@Service("myNotificationService")
public class NotificationService {

	// this constructor is invoked during the component scan i.e @ComponentScan
    public NotificationService(){
    	System.out.println("-------------------------In notification service constructor");

    }

    public void send(){
        // do something
    }

    public void sendAsync(){
        // do something
    }

    @Override
    public String toString() {
        return "NotificationService{}";
    }
}
