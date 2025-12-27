package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 * changes_cicdlab
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello Class 5D", app.getMessage());
    }
}
