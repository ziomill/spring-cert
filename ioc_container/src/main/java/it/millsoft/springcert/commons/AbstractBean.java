package it.millsoft.springcert.commons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractBean
{
    protected static Logger LOGGER = LogManager.getLogger();

    protected InjectedBean injectedBean;

    public void printInjectedBeanInstanceUUID()
    {
        LOGGER.info("Instance UUID of InjectedBean: " + injectedBean.getInstanceUUID());
    }
}
