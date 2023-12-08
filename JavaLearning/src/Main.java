import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();


        JFrame frame = new JFrame("Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(514, 537);
        frame.getContentPane().add(graph);
        frame.setVisible(true);
    }
}