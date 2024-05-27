package dev.mdchap;

import org.junit.Test;

import static org.junit.Assert.assertSame;


/**
 * Unit tests for App.
 */
public class AppTest {
    /**
     * Create an App and check its state is CREATED.
     */
    @Test
    public void shouldAnswerWithTrue() {
        App app = new App();
        assertSame("State is not CREATED", app.getState(), App.AppState.CREATED);
    }
}
