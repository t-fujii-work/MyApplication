package com.example.myapplication;

import java.util.ArrayList;

public class Console {
    private ArrayList<String> lines;

    Console() {
        lines = new ArrayList<>();
        lines.add("Console created.");
    }

    public ArrayList<String> getLines() {
        return lines;
    }
}
