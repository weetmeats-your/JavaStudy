package com.qiyi.java.jfx.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * @program：java-jfx
 * @description: 颜色调整效果
 * @author: qiyi
 * <p>
 * create: 2021-10-07 23:41
 **/
public class ColorAdjustEffectExample extends Application {
    @Override
    public void start(Stage stage) {
        Image image = new Image("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ffile03.16sucai.com%2F2016%2F10%2F1100%2F16sucai_p20161101172_75d.JPG&refer=http%3A%2F%2Ffile03.16sucai.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1636245984&t=8e874fe511b97e48250718d3b624a48e");
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(90);
        imageView.setFitWidth(400);
        imageView.setFitHeight(200);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);
        //insantiating the colorAdjust class
        ColorAdjust colorAdjust = new ColorAdjust();
        //对比度
        colorAdjust.setContrast(0.1);
        //色相
        colorAdjust.setHue(-0.05);
        //亮度
        colorAdjust.setBrightness(0.6);
        //饱和度
        colorAdjust.setSaturation(0.6);
        //apply color adjust effect to  the ImageView node
        imageView.setEffect(colorAdjust);

        Group root = new Group(imageView);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("color Adjust effect example");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);

    }
}
