package com.qiyi.java.jfx.basic;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

/**
 * @program：java-jfx
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-06 23:23
 **/
public class ColorExample extends Application {
    @Override
    public void start(Stage stage){
        //Drawing a Circle
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(180.0f);

        //Setting color and stroke to the circle
        circle.setFill(Color.DARKRED);
        circle.setStrokeWidth(80);
        circle.setStroke(Color.BLUE);

        //Drawing a text
        Text text = new Text("this is a color circle");
        text.setFont(Font.font("Edwardian Script ITC",50));
        text.setX(155);
        text.setY(50);
        text.setFill(Color.BEIGE);
        text.setStrokeWidth(4);
        text.setStroke(Color.AQUAMARINE);

        //Creating a Group object
        Group root = new Group(circle,text);
        Scene scene = new Scene(root,700,400);
        stage.setTitle("Color Example");
        stage.setScene(scene);
        stage.show();

    }

}
