package com.example.myapplication;

import java.util.ArrayList;

/**
 * コンソールのデータクラス
 */
public class Console {
    private ArrayList<String> lines;

    Console() {
        lines = new ArrayList<>();
        lines.add("Console available.");
    }

    public ArrayList<String> getLines() {
        return lines;
    }
}
