package it.millsoft.springcert.ioc.factory_method;

import it.millsoft.springcert.commons.Singleton;

public class MyBean
{
    private Singleton theSingleton;

    public MyBean(Singleton theSingleton)
    {
        this.theSingleton = theSingleton;
    }

    public void printSingletonInstanceUUID()
    {
        System.out.println("Singleton UUID: " + theSingleton.getUUID());
    }
}
