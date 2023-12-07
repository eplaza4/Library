package com.example.library;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Controller class for the Hello view in the JavaFX application.
 * This class is responsible for handling user interactions with the Hello view.
 */
public class HelloController {
    @FXML
    private Label welcomeText; // The label used to display text in the UI.

    /**
     * Handler method for the button click event,
     * When the Hello button is clicked, this method updates the text of the welcome label.
     */
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the Library Management System!");
    }
}