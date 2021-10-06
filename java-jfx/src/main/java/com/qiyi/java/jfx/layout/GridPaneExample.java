package com.qiyi.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;


/**
 * @program：java-jfx
 * @description: 网络布局
 * @author: qiyi
 * <p>
 * create: 2021-10-05 23:17
 **/
public class GridPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        Text text1 = new Text("Email");
        Text text2 = new Text("Password");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(300, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(button1, 0, 2);
        gridPane.add(button2, 1, 2);
        Scene scene = new Scene(gridPane, 400, 300);
        stage.setTitle("Grid Pane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}