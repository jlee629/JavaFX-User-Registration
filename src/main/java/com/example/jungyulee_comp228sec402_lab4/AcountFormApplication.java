package com.example.jungyulee_comp228sec402_lab4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AcountFormApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AcountFormApplication.class.getResource("accountForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Centennial Bank of Students");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}