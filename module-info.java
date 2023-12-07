/**
 * This is the module descriptor for the example.library module.
 * It defines the dependencies and packages that the module requires and exports.
 * <p>Dependencies:</p>
 * <ul>
 *     <li>javafx.controls - Required for JavaFX control elements.</li>
 *     <li>javafx.fxml - Required for FXML functionalities in JavaFX.</li>
 *     <li>java.logging - Required for logging capabilities.</li>
 * </ul>
 * <p>The module opens the package com.example library to javafx.fxml to allow FXML to access classes in this package.</p>
 * <p>It also exports the com.example library package to make it available for other modules to use.</p>
 */
module com.example.library {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.sql;


    opens com.example.library to javafx.fxml;
    exports com.example.library;
}