package com.example.algorithmvisualizer;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;

public class DrawableNumber extends StackPane {


    private int number;
    private Text text;
    private Rectangle background;
    private Text annotation;

    public DrawableNumber(int num,Color bgCol ,Color borderCol,Color textCol){

        initBackground(bgCol,borderCol);
        initText(num,textCol);

        StackPane.setAlignment(background, javafx.geometry.Pos.CENTER);
        StackPane.setAlignment(text, javafx.geometry.Pos.CENTER);
        getChildren().addAll(background,text);
    }


    private void initBackground(Color bgCol, Color borderCol){
        background = new Rectangle();
        background.setStroke(borderCol);
        background.setStrokeWidth(2);
        background.setFill(bgCol);
    }

    private void initText(int num,Color textCol){
        text = new Text();
        setNumber(num);
        text.setFill(textCol);
        text.setFont(new Font(20));
        text.setBoundsType(TextBoundsType.VISUAL);
    }

    public void addAnnotation(char s,Color annCol){
        annotation = new Text(String.valueOf(s));
        annotation.setFill(annCol);
        annotation.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 20));
        annotation.setTranslateY(+2*text.getBoundsInParent().getMinY());
        getChildren().add(annotation);
    }

    public void removeAnnotation(){
        getChildren().remove(annotation);
        annotation = null;
    }



    public void setNumber(int num){
        this.number = num;
        text.setText(String.valueOf(num));
        double padding = 10;
        double width = text.getBoundsInParent().getWidth() + padding * 2;
        double height = text.getBoundsInParent().getHeight() + padding * 2;
        updateBackground(width,height);

    }

    private void updateBackground(double width, double height){
        background.setWidth(width);
        background.setHeight(height);
    }

    public int getNumber(){
        return this.number;
    }

    public void highlight(Color highlightCol){
        background.setFill(highlightCol);
    }





}
