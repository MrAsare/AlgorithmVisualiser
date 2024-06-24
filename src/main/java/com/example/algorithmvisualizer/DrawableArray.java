package com.example.algorithmvisualizer;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;

public class DrawableArray extends HBox{

    DrawableNumber[] drawableNumbers;


    private int spacing = 0;

    public DrawableArray(int[] nums,Color bgCol ,Color borderCol,Color textCol){
        drawableNumbers = new DrawableNumber[nums.length];

        for(int i=0;i<nums.length;i++) {
            drawableNumbers[i] = new DrawableNumber(nums[i], bgCol,borderCol, textCol);
            getChildren().addAll(drawableNumbers[i]);
        }

    }


    public void setSpacing(int spacing) {
        super.setSpacing(spacing);
    }



    public void highlightElement(int idx,Color highlightCol){
        if(idx>drawableNumbers.length-1 || idx<0){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            drawableNumbers[idx].highlight(highlightCol);
        }
    }
    public void highlightAllElements(Color highlightCol){
        for(int i=0;i<drawableNumbers.length;i++){
            drawableNumbers[i].highlight(highlightCol);
        }
    }

    public int getValueAt(int idx){
        if(idx>drawableNumbers.length-1 || idx<0){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            return drawableNumbers[idx].getNumber();
        }
    }



}
