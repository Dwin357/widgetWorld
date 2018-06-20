package io.github.dwin357;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("widgetFloor")
public class WidgetFloor extends RouteBuilder {

    @Autowired
    private ApplicationContext applicationContext;
    
    @Override
    public void configure() throws Exception {
        from("quartz2://theWorld/shipmentDelivered?trigger.repeatInterval=2&trigger.repeatCount=5")
          .to("log:io.github.dwin357?level=INFO");
    }
    
}
