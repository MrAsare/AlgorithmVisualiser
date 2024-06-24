package com.example.algorithmvisualizer;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.DateCell;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashSet;

public class HelloApplication extends Application {

    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    DrawableArray drawableArray = new DrawableArray(new int[]{1,233,51,-1,5,6});


    Canvas canvas;

    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(CreateContent()));
        stage.show();




    }


    private Parent CreateContent(){
        FlowPane root = new FlowPane();
        root.setPrefSize(WIDTH,HEIGHT);
        canvas = new Canvas(WIDTH,HEIGHT);


        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                drawableArray.step();
            }
        };

        timer.start();

        root.getChildren().addAll(canvas,drawableArray);


        return root;
    }


    public static void main(String[] args) {
        launch();
    }
}