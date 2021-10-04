package top.qiyi.java.basic.layout;

import java.awt.*;
import java.rmi.activation.ActivationGroup_Stub;

/**
 * @program：JavaStudy
 * @description: 边框布局
 * @author: qiyi
 * <p>
 * create: 2021-10-05 00:48
 **/
public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        BordPane bPane = new BorderPane();
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
        launch(agrs);
    }
}
