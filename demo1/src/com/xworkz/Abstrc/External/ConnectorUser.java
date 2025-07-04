package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Connector;

public class ConnectorUser {

    private Connector connector;

    public ConnectorUser(Connector connector)
    {
        this.connector = connector;
        System.out.println("using connector arg in connector class");
    }
    public void execute()
    {
        System.out.println("running execute in connector");
        if(this.connector !=null) {
            this.connector.run();
        }
        else {
            System.err.println("connector is null");
        }
    }
}