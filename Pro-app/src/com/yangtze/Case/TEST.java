package com.yangtze.Case;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TEST {
    public static void main(String[] args) {
        // 匿名内部类在开发中的真实使用场景
        // GUI 编程
        // 1、创建窗口
        JFrame mainWindow = new JFrame("主界面");
        JPanel panel = new JPanel();
        mainWindow.add(panel);

        JButton btnLogin = new JButton("登录");

        panel.add(btnLogin);

        // 给按钮绑定单击事件监听器（匿名内部类）
        // 核心目的：简化代码
        /*btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainWindow, "登录成功！");
            }
        });*/

        // 等价于上述注释的代码
        btnLogin.addActionListener(e -> JOptionPane.showMessageDialog(mainWindow, "登录成功！"));


        mainWindow.setSize(400, 400);

        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
}
