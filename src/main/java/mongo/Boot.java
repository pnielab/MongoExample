package mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
@SpringBootApplication
public class Boot {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Boot.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println("bean loaded: " + bean);
        }
    }

}
