package it.millsoft.springcert.ioc;

import java.util.UUID;

public class Singleton
{
    private static Singleton INSTANCE;
    private UUID uuid;

    private Singleton()
    {
        uuid = UUID.randomUUID();
    }

    public static Singleton getINSTANCE()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getUUID()
    {
        return uuid.toString();
    }

}
