package com.example.myapplication;


import android.widget.TextView;

import java.util.ArrayList;

/**
 * コンソールを扱うクラス
 */
public class ConsoleService {
    private Console console;
    private TextView textView;

    private ArrayList<Person> persons = new ArrayList<>();

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
        run(line);
        refresh();
    }

    public void clear() {
        console.getLines().clear();
        refresh();
    }

    public void run(String line) {
        String[] words = line.split(" ");
//        if (words.length > 0 && words[0].equals("create")) {
//            if (words.length > 1 && words[1].equals("person")) {
//                if (words.length > 3 && words[3].matches("^\\d+$")) {
//                    String name = words[2];
//                    int age = Integer.parseInt(words[3]);
//                    Person person = new Person(name, age);
//                    persons.add(person);
//                    console.getLines().add("created: " + person.toString());
//                }
//            }
//        } else if (words.length > 1 && words[0].equals("show") && words[1].equals("persons")) {
//            StringBuilder sb = new StringBuilder();
//            for (Person person: persons) {
//                sb.append(person.getId() + ": " + person.toString() + "\n");
//            }
//            console.getLines().add(sb.toString());
//        }
        if (words.length > 0) {
            switch (words[0]) {
                case "create":
                    if (words.length > 3 && words[1].equals("person") && words[3].matches("^\\d+$")) {
                        String name = words[2];
                        int age = Integer.parseInt(words[3]);
                        Person person = new Person(name, age);
                        persons.add(person);
                        console.getLines().add("created: " + person.toString());
                    }
                    break;
                case "show":
                    if (words.length > 1 && words[1].equals("persons")) {
                        StringBuilder sb = new StringBuilder();
                        for (Person person: persons) {
                            sb.append(person.getId() + ": " + person.toString() + "\n");
                        }
                        console.getLines().add(sb.toString());
                    }
                    break;
            }
        }
    }
}
