package com.example.algorithmvisualizer;

import javafx.scene.paint.Color;

public class BinarySearch {

    private DrawableArray arrayToSort;
    private int target;
    private int l;
    private int r;
    private int m;
    private boolean isRunning;

    private BinarySearch(DrawableArray arrayToSort){
        this.arrayToSort = arrayToSort;




    }

    public void step(){

        if(l<r && isRunning){
            m = l + (r-l)/2;
            if(target<arrayToSort.getValueAt(m)){
                r=m-1;
            }else if(target>arrayToSort.getValueAt(m)){
                l = r+1;
            }else{
                arrayToSort.highlightElement(m, Color.GREEN);
            }
        }
    }



}
