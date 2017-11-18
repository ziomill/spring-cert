package it.millsoft.springcert.commons;

import java.util.UUID;

public class InjectedBean
{
    private UUID instanceUUID;

    public InjectedBean()
    {
        this.instanceUUID = UUID.randomUUID();
    }

    public String getInstanceUUID()
    {
        return this.instanceUUID.toString();
    }
}
