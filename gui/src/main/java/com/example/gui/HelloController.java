package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URISyntaxException;


public class HelloController {


    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    static int scelta;




    public void nuovaRicerca(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        scelta = 1;
    }

    public void ricercaArchivio(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        scelta = 2;
    }

    public void crediti(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample4.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void segnalaProblema(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample5.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void linkgit(ActionEvent actionEvent) throws URISyntaxException, IOException {
        Runtime.getRuntime().exec("cmd.exe /c start iexplore " + "https://github.com/AleCongi/Metodi_Avanzati_di_Programmazione");

    }
}

