package it.millsoft.springcert.ioc;

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
