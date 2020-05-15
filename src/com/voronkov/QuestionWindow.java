package com.voronkov;

import javax.swing.*;
import java.awt.*;

import static com.voronkov.Question.getQuestion;

public class QuestionWindow extends JFrame {
    private JLabel questionField;
    private JButton buttonNext;
    private JPanel questionPanel;

    public QuestionWindow() throws HeadlessException {
        JFrame frame = new JFrame("Java random questions");

        frame.setContentPane(questionPanel);
        frame.setVisible(true);
        frame.setSize(600, 400);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        buttonNext.addActionListener(e -> {
            //Действие
            questionField.setText(getQuestion());
        });
    }

    public static void main(String[] args) {
        new QuestionWindow();
    }
}
