package it.millsoft.springcert.ioc.initialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/initialization-app-config.xml");

        FirstServiceBean firstServiceBean = (FirstServiceBean) context.getBean("firstServiceBean");
        firstServiceBean.printInjectedBeanInstanceUUID();

        SecondServiceBean secondServiceBean = (SecondServiceBean) context.getBean("secondServiceBean");
        secondServiceBean.printInjectedBeanInstanceUUID();
    }
}
