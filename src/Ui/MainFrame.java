package Ui;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class MainFrame extends JFrame{
	public static void main(String[] args) {
		new MainFrame().init();
	}
	//定义组件
	JPanel panel;
	JPanel panel2;
	JTextArea area;
	JButton btn;
	JButton btn2;
	JScrollPane js;
	Border b = BorderFactory.createLineBorder(Color.red);
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
		
       panel2 = new Mypanel();
		panel2.setBorder(b);
		this.getContentPane().add(panel2);
		panel2.setBounds(0, 0,600,600);
		this.setBounds(200, 70, 800,630);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
