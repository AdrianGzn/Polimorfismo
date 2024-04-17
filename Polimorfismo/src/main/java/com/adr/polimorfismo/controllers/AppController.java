package com.adr.polimorfismo.controllers;

import com.adr.polimorfismo.App;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

public class AppController {

    @FXML
    private Button addButton;

    @FXML
    private Button base1;

    @FXML
    private Button base2;

    @FXML
    private Button base3;

    @FXML
    private Button closeButton;

    @FXML
    private Button updataButton;

    @FXML
    void onMouseClickedBase1(MouseEvent event) {
        App.newStage("base1-view", "Base de datos 1");
    }

    @FXML
    void onMouseClickedBase2(MouseEvent event) {
        App.newStage("base2-view", "Base de datos 2");
    }

    @FXML
    void onMouseClickedBase3(MouseEvent event) {
        App.newStage("base3-view", "Base de datos 3");
    }

    @FXML
    void onMouseClickedAñadir(MouseEvent event) {
        App.newStage("add-view", "Añadir");
    }

    @FXML
    void onMouseClickedUpdata(MouseEvent event) {
        App.newStage("updata-view", "Actualizar");
    }

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        Platform.exit();
    }
}
