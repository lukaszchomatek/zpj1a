package pl.lodz.p.zpj;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloWorldTest
{
    @Test
    public void sayHelloTest() {
        HelloWorld hw = new HelloWorld();
        org.junit.Assert.assertEquals("Hello ", hw.sayHello(""));
    }
}