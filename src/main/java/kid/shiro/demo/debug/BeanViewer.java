package kid.shiro.demo.debug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author kid  2018-09-19 20:46
 */
@Component
public class BeanViewer implements CommandLineRunner {
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {

        String[] beanNames =  applicationContext.getBeanDefinitionNames();

        System.out.println("所以beanNames个数："+beanNames.length);

        for(String bn:beanNames) {

            System.out.println(bn);
        }
    }
}
