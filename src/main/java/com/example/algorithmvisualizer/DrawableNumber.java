package com.example.algorithmvisualizer;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;

public class DrawableNumber extends StackPane {


    private int number;
    private Text text;
    private Rectangle background;

    public DrawableNumber(int num){
        text = new Text();
        text.setBoundsType(TextBoundsType.VISUAL);
        text.setFont(new Font(20));


        background = new Rectangle();
        background.setStroke(Color.BLACK);
        background.setFill(Color.ORANGE);

        setNumber(num);

        StackPane.setAlignment(background, javafx.geometry.Pos.CENTER);
        StackPane.setAlignment(text, javafx.geometry.Pos.CENTER);
        getChildren().addAll(background,text);
    }



    public void setNumber(int num){
        this.number = num;
        text.setText(String.valueOf(num));
        double padding = 10;
        double width = text.getBoundsInParent().getWidth() + padding * 2;
        double height = text.getBoundsInParent().getHeight() + padding * 2;
        background.setWidth(width);
        background.setHeight(height);
    }

    public int getNumber(){
        return this.number;
    }





}
