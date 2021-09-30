package com.qiyi.javajfx.ctrl;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.jar.JarEntry;

/**
 * @program：java-jfx
 * @description: 主界面控制
 * @author: qiyi
 * <p>
 * create: 2021-09-30 21:18
 **/
//public class MainCtrl {
public class MainCtrl implements Initializable {

    public Pane rootPane;

    public Button btnAlert;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("initialize: " + location.getPath());
    }

    /**
     * 弹出框按钮单击事件
     *
     * @param actionEvent 事件对象
     */
    public void onBtnAlertClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("国庆节快乐");
        alert.show();
    }
}


