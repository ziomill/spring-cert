package it.millsoft.springcert.ioc.initialization;

import it.millsoft.springcert.commons.AbstractBean;
import it.millsoft.springcert.commons.InjectedBean;

public class FirstServiceBean extends AbstractBean
{
    private String scalar;

    public FirstServiceBean(InjectedBean injectedBean,String scalar) {
        this.injectedBean = injectedBean;
        this.scalar = scalar;
    }

}
