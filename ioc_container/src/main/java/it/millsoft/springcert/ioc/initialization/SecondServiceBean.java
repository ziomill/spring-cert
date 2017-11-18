package it.millsoft.springcert.ioc.initialization;

import it.millsoft.springcert.commons.AbstractBean;
import it.millsoft.springcert.commons.InjectedBean;

public class SecondServiceBean extends AbstractBean
{
    private String scalar;

    public void setInjectedBean(InjectedBean injectedBean)
    {
        this.injectedBean = injectedBean;
    }

    public void setScalar(String scalar) {
        this.scalar = scalar;
    }
}
