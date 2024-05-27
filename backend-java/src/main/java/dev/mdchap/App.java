package dev.mdchap;

import java.util.logging.Logger;


/**
 * Run the app.
 */
public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    private AppState state = AppState.CREATED;

    public App() {
    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
        app.end();
    }

    private void start() {
        logger.fine("Starting app...");
        // TODO: startup app
        state = AppState.STARTED;
    }

    private void end() {
        logger.fine("Ending app...");
        // TODO: tear down app
        state = AppState.ENDED;
    }

    public AppState getState() {
        return state;
    }

    public enum AppState {
        CREATED, STARTED, ENDED
    }
}
