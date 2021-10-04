package com.qiyi.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @program：java-jfx
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-05 00:54
 **/
public class HboxExample extends Application{
    @Override
    public void start(Stage stage){
        TextField textField = new TextField();
        Button playButton = new Button("play");
        Button stopButton = new Button( "stop");

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        HBox.setMargin(textField,new Insets(20,20,20,20));
        HBox.setMargin(playButton,new Insets(20,20,20,20));
        HBox.setMargin(stopButton,new Insets(20,20,20,20));

        hbox.getChildren().addAll(textField,playButton,stopButton);

        Scene scene = new Scene (hbox,400,300);
        stage.setTitle("Hbox Example");
        stage.setScene(scene);
        stage.show();
    }
      public static void main(String[] args){ launch(args); }
}

