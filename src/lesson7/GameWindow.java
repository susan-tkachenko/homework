package lesson7;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private int width = 1024;
    private int height = 768;
    private int posX = 300;
    private int posY = 150;

    private JButton btnStart;
    private JButton btnExit;

    private JPanel mainToolsPanel;
    private JPanel settingPanel;

    private Map map;

    GameWindow() {
        prepareWindow();
        prepareToolsPanel();
        prepareButtons();
        prepareSettingsPanel();

        btnStart = new JButton("Start game");
        btnExit = new JButton("Exit game");
        map = new Map();

        add(map);

        setVisible(true);
    }

    private void prepareWindow() {
        setSize(width, height);
        setLocation(posX, posY);
        setTitle("Application");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void prepareToolsPanel() {
        mainToolsPanel = new JPanel();
        mainToolsPanel.setLayout(new GridLayout(2, 1));
    }

    private void prepareButtons() {
        btnStart = new JButton("Start game");
        btnExit = new JButton("Exit game");
    }

    private void prepareSettingsPanel() {
        settingPanel = new JPanel();
        settingPanel.setLayout(new GridLayout(4, 1));

        settingPanel.add(btnStart);
        settingPanel.add(btnExit);
    }

}




