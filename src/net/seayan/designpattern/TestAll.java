
package net.seayan.designpattern;

import net.seayan.designpattern.singleton.Singleton;

public class TestAll
{
    public static void main(String[] args)
    {
        Singleton.getInstance().someOtherMethod();
    }

}
