package Ui;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
/*
 * 定义MainFrame继承Jfame类。
 * 在该类中定义组件，实现界面
 * 
 * */
public class MainFrame extends JFrame{
	public static void main(String[] args) {
		new MainFrame().init();
	}
	//定义棋盘组件
	JPanel panel;
	JPanel panel2;
	JTextArea area;
	JButton btn;
	JButton btn2;
	JScrollPane js;
	Border b = BorderFactory.createLineBorder(Color.red);
	//定义棋子组件
	JLabel red ;
	JLabel redking = new JLabel(new ImageIcon("img\\redking.png"));
	JLabel blue;
	JLabel blueking = new JLabel(new ImageIcon("img\\blueking.png"));
	private void init() {
		//初始化组件
		
		this.setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		area = new JTextArea();
		js = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(js);
		js.setBounds(0, 2, 195, 300);
		btn = new JButton("显示");
		btn2 = new JButton("消失");
		panel.add(btn);
		btn.setBounds(0, 315, 60,40);
		panel.add(btn2);
		btn2.setBounds(120, 315, 60,40);
		this.add(panel);
		panel.setBounds(601, 0, 199,600);
		//绘制棋盘，并将棋子放置到棋盘上
       panel2 = new Mypanel();
		panel2.setBorder(b);
		panel2.setLayout(null);
		//添加红子
		int h = 0;
		int w = 0;
		for(int i = 1; i <= 4;i++ ){
			if(i%2==1){
				w = 60;
				for(int j = 1;j <= 5;j++){
				red =  new JLabel( new ImageIcon("img\\red.png"));
				panel2.add(red);
				red.setBounds(w, h, 60,60);
				w+=120;
				}
			}else{
				w = 0;
				for(int j = 1;j <= 5;j++){
				red =  new JLabel( new ImageIcon("img\\red.png"));
				panel2.add(red);
				red.setBounds(w, h, 60, 60);
				w+=120;
				}
			}
			h+=60;
		}
		//添加篮子
		h = 360;
		for(int i = 1; i <= 4;i++ ){
			if(i%2==1){
				w = 60;
				for(int j = 1;j <= 5;j++){
				blue = new JLabel(new ImageIcon("img\\blue.png"));
				panel2.add(blue);
				blue.setBounds(w, h, 60,60);
				w+=120;
				}
			}else{
				w = 0;
				for(int j = 1;j <= 5;j++){
			   blue = new JLabel(new ImageIcon("img\\blue.png"));
				panel2.add(blue);
				blue.setBounds(w, h, 60, 60);
				w+=120;
				}
			}
			h+=60;
		}
		this.getContentPane().add(panel2);
		panel2.setBounds(0, 0,600,600);
		this.setBounds(200, 70, 800,630);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
