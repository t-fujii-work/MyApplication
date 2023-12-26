package com.example.myapplication;


import android.widget.TextView;

public class ConsoleService {
    private Console console;
    private TextView textView;

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public void refresh() {
        String content = String.join("\n", console.getLines());
        textView.setText(content);
    }

    public void add(String line) {
        console.getLines().add(line);
        refresh();
    }

    public void clear() {
        console.getLines().clear();
        refresh();
    }
}
