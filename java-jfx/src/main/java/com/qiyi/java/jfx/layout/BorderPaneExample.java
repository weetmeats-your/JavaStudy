package com.qiyi.java.jfx.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @program：java-jfx
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-05 00:54
 **/
public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane bPane = new BorderPane();
        bPane.setTop(new TextField("top"));
        bPane.setBottom(new TextField("Bottom"));
        bPane.setLeft(new TextField("Left"));
        bPane.setRight(new TextField("Right"));
        bPane.setCenter(new TextField("Center"));

        Scene scene = new Scene(bPane, 400, 300);
        stage.setTitle("BorderPane Example");
        stage.setScene(scene);
        stage.show();

    }
    public static void main (String[] args){
        launch(args);
    }
}
