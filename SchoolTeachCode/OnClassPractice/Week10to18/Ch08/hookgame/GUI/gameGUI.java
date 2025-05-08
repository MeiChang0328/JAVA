package Week10to18.Ch08.hookgame.GUI;

import Week10to18.Ch08.hookgame.gameObject.bucket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameGUI {
    private JButton Button1;
    private JButton Button9;
    private JButton Button3;
    private JButton Button4;
    private JButton Button6;
    private JButton Button2;
    private JButton Button5;
    private JButton Button0;
    private JButton Button7;
    private JButton Button8;
    private JPanel gameGUI;
    private  static bucket bucket1;


    public gameGUI() {
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(0);
                if (result==1){
                    Button0.setText("成功");
                }else if(result==0){
                    Button0.setText("失敗");
                }else if (result==-1){
                    Button0.setText("爆，失敗");
                }
            }

        });
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(1);
                if (result==1){
                    Button1.setText("成功");
                }else if(result==0){
                    Button1.setText("失敗");
                }else if (result==-1){
                    Button1.setText("爆，失敗");
                }

            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(2);
                if (result==1){
                    Button2.setText("成功");
                }else if(result==0){
                    Button2.setText("失敗");
                }else if (result==-1){
                    Button2.setText("爆，失敗");
                }
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(3);
                if (result==1){
                    Button3.setText("成功");
                }else if(result==0){
                    Button3.setText("失敗");
                }else if (result==-1){
                    Button3.setText("爆，失敗");
                }
            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(4);
                if (result==1){
                    Button4.setText("成功");
                }else if(result==0){
                    Button4.setText("失敗");
                }else if (result==-1){
                    Button4.setText("爆，失敗");
                }
            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(5);
                if (result==1){
                    Button5.setText("成功");
                }else if(result==0){
                    Button5.setText("失敗");
                }else if (result==-1){
                    Button5.setText("爆，失敗");
                }
            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(6);
                if (result==1){
                    Button6.setText("成功");
                }else if(result==0){
                    Button6.setText("失敗");
                }else if (result==-1){
                    Button6.setText("爆，失敗");
                }
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(7);
                if (result==1){
                    Button7.setText("成功");
                }else if(result==0){
                    Button7.setText("失敗");
                }else if (result==-1){
                    Button7.setText("爆，失敗");
                }
            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(8);
                if (result==1){
                    Button8.setText("成功");
                }else if(result==0){
                    Button8.setText("失敗");
                }else if (result==-1){
                    Button8.setText("爆，失敗");
                }
            }
        });
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=bucket1.put_knifes(9);
                if (result==1){
                    Button9.setText("成功");
                }else if(result==0){
                    Button9.setText("失敗");
                }else if (result==-1){
                    Button9.setText("爆，失敗");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("gameGUI");
        frame.setContentPane(new gameGUI().gameGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,150);
        frame.setLocation(550,300);
        frame.setVisible(true);
        bucket1=new bucket();
    }
}


