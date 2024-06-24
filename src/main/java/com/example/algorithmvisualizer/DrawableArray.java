package com.example.algorithmvisualizer;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;

public class DrawableArray extends HBox{

    DrawableNumber[] drawableNumbers;

    public DrawableArray(int[] nums){
        drawableNumbers = new DrawableNumber[nums.length];
        for(int i=0;i<nums.length;i++) {
            drawableNumbers[i] = new DrawableNumber(nums[i]);
            getChildren().add(drawableNumbers[i]);
        }

    }

    public void step(){



    }



}
