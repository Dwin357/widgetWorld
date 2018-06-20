package io.github.dwin357;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dwin
 */
public class PerspectiveWindow {
    
    public static void main(String[] args) {
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/io/github/dwin357/application-context.xml");

        Integer min = 1;
        Integer seconds = 60 * min;
        Integer miliseconds = (seconds * 1000);
        System.out.println("Peer into the window for min:" + min);
//        context.start();
        
        try { Thread.sleep(miliseconds); } catch(InterruptedException e) { /*ignore*/ }
        
//        context.stop();
//        context.close();
        System.out.println("Away from the window");
    }
}
