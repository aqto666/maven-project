package org.epam.converter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void runMain() {
        App.main(null);
    }

    @Test
    public void testConstructor() {
        new App();
    }
}
