package tutorialspringboot.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HellowWorldConfoguration {

    @Test
    void testApplicationContext(){

        ApplicationContext context = new AnnotationConfigApplicationContext(HellowWorldConfoguration.class);

        Assertions.assertNotNull(context);
    }
    
}
