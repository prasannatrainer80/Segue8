package com.rks.beans;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

public class Opeartion {
	public void msg()
    {
        System.out.println("msg method invoked");
    }
    public int m()
    {
        System.out.println("m method invoked..");
        return 2;
    }
    public void k()
    {
        System.out.println("k method invoked..");
    }
}
