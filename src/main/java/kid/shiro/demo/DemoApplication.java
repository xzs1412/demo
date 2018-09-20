package kid.shiro.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
private static ApplicationContext applicationContext;

    private static Logger logger= LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        logger.debug("main excuted");
        applicationContext=   SpringApplication.run(DemoApplication.class, args);

    }

    @Bean
    public ApplicationContext applicationContext(){
        return applicationContext;
    }


}
