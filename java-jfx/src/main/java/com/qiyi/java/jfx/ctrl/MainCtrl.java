package com.qiyi.java.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
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
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public AnchorPane panel1;
    public AnchorPane panel2;
    public AnchorPane panel3;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("initialize: " + location.getPath());
        btn1.setOnMouseClicked(e -> changePanel(1));
        btn2.setOnMouseClicked(e -> changePanel(2));
        btn3.setOnMouseClicked(e -> changePanel(3));
    }

    public void changePanel(int panelId) {
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        if (panelId == 1) {
            panel1.setVisible(true);
        } else if (panelId == 2) {
            panel2.setVisible(true);
        } else if (panelId == 3) {
            panel3.setVisible(true);
        }
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


