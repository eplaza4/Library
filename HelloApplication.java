package com.example.library;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * The main class for the JavaFX application.
 * This class sets up the primary stage (window) and loads the initial scene.
 */
public class HelloApplication extends Application {

    /**
     * Starts the JavaFX application. This method is called after the application has been initialized.
     * It sets up the primary stage and loads the initial scene from an FXML file.
     * @param stage The primary stage for this application, onto which the application scene can be set.
     * @throws IOException If there is an issue loading the FXML file.
     */
    @Override
    public void start( Stage stage ) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main method for launching the application.
     * This is the entry point method called by the JavaFX runtime.
     * @param args Command line arguments passed to the application.
     */
    public static void main( String[] args ) {
        launch();
    }
}