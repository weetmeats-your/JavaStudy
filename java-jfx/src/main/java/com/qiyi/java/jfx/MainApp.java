package com.qiyi.java.jfx;

import com.qiyi.java.jfx.view.PersonEditController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import com.qiyi.java.jfx.model.Person;
import com.qiyi.java.jfx.view.PersonController;

import java.io.IOException;
import java.time.LocalDate;

/**
 * @program：java-jfx
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-08 23:22
 **/
public class MainApp extends Application {

    private final ObservableList<Person> personData = FXCollections.observableArrayList();

    private Stage stage;

    private BorderPane rootLayout;


    public MainApp() {
        personData.add(new Person("王林", "软件2126", "男", "江苏南京",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img10.jpg")));
        personData.add(new Person("彭海洋", "软件2126", "男", "江苏扬州",
                LocalDate.of(1999, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img11.jpg")));
        personData.add(new Person("郭佳", "软件2126", "女", "江苏苏州",
                LocalDate.of(2001, 11, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img12.jpg")));
        personData.add(new Person("黄志伟", "软件2126", "男", "江苏泰州",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img13.jpg")));
        personData.add(new Person("张珂", "软件2126", "女", "江苏徐州",
                LocalDate.of(2001, 9, 11), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img14.jpg")));
        personData.add(new Person("赵丹", "软件2136", "女", "江苏南通",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img15.jpg")));
        personData.add(new Person("张建凤", "软件2136", "女", "江苏无锡",
                LocalDate.of(2001, 2, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img16.jpg")));
        personData.add(new Person("杨阳", "软件1851", "男", "江苏南京",
                LocalDate.of(2000, 10, 23), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img22.jpg")));
        personData.add(new Person("尚宇驰", "软件1851", "女", "江苏徐州",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img20.jpg")));
        personData.add(new Person("陈蓉琪", "软件1851", "女", "江苏南京",
                LocalDate.of(2000, 3, 21), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img19.jpg")));
    }

    public Stage getStage() {
        return stage;
    }


    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setTitle("AddressBook");
        initRootLayout();
        showPerson();
    }


    public void initRootLayout() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("fxml/root-layout.fxml"));
            rootLayout = fxmlLoader.load();
            Scene scene = new Scene(rootLayout, 820, 540);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPerson() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("fxml/person.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            rootLayout.setCenter(anchorPane);
            PersonController controller = fxmlLoader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showNewPersonStage() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("fxml/person-edit.fxml"));
            AnchorPane anchorPane = loader.load();
            Stage editStage = new Stage();
            editStage.setTitle("Edit Person");
            Scene scene = new Scene(anchorPane, 640, 480);
            editStage.setScene(scene);
            PersonEditController controller = loader.getController();
            controller.setEditStage(editStage);
            controller.setMainApp(this);
            editStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public static void main(String[] args) {
        launch();
    }
}