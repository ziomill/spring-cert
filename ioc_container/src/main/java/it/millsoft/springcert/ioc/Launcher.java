package it.millsoft.springcert.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");

        MyBean bean = (MyBean) context.getBean("myBean");
        bean.printSingletonInstanceUUID();
    }
}
