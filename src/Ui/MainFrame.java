package Ui;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import checker.Check;
import tools.StorageCheck;
/*
 * ����MainFrame�̳�Jfame�ࡣ
 * �ڸ����ж��������ʵ�ֽ���
 * 
 * */
public class MainFrame extends JFrame{
	public static void main(String[] args) {
		new MainFrame().init();
	}
	//�����������
	JPanel panel;
	JPanel panel2;
	JTextArea area;
	JButton btn;
	JButton btn2;
	JScrollPane js;
	Border b = BorderFactory.createLineBorder(Color.red);
	//�����������
	private static final Toolkit toolkit = Toolkit.getDefaultToolkit();
	Check red;
	Check blue;
	//��ȡͼƬ
	Image redImage = toolkit.getImage("img\\red.png");
	Image redkingImage = toolkit.getImage("img\\redking.png");
	Image blueImage = toolkit.getImage("img\\blue.png");
	Image bluekingImage = toolkit.getImage("img\\blue.png");

	//�������ӵ�id
	public static int id = 1;
	//������������������洢ѡ�񵽵�����
    Check check = null;
	//��ʼ������init������
	private void init() {
		//��ʼ�����
		
		this.setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		area = new JTextArea();
		js = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(js);
		js.setBounds(0, 2, 195, 300);
		btn = new JButton("����");
		btn2 = new JButton("�ƶ�");
		panel.add(btn);
		btn.setBounds(0, 315, 60,40);
		panel.add(btn2);
		btn2.setBounds(120, 315, 60,40);
		this.add(panel);
		panel.setBounds(601, 0, 199,600);
		//�������̣��������ӷ��õ�������
       panel2 = new Mypanel();
		panel2.setBorder(b);
		panel2.setLayout(null);

		//��Ӻ���
		int h = 0;
		int w = 0;
		for(int i = 1; i <= 4;i++ ){
			if(i%2==1){
				w = 60;
				for(int j = 1;j <= 5;j++){
				red =  new Check(redImage);
				panel2.add(red);
				red.setBounds(w, h, 60,60);
				//�����Ӷ���洢��hashmap��
				red.setId(id);
				red.setColor("red");
				red.setX(w/60+1);
				red.setY(h/60+1);
				StorageCheck.addCheck( id, red);
				w+=120;
				id += 1;
				}
			}else{
				w = 0;
				for(int j = 1;j <= 5;j++){
				red =  new Check( redImage);
				panel2.add(red);
				red.setBounds(w, h, 60, 60);
				red.setId(id);
				red.setColor("red");
				red.setX(w/60+1);
				red.setY(h/60+1);
				StorageCheck.addCheck( id, red);
				w+=120;
				id += 1;
				}
			}
			h+=60;
	
		}
		//�������
		h = 360;
		for(int i = 1; i <= 4;i++ ){
			if(i%2==1){
				w = 60;
				for(int j = 1;j <= 5;j++){
				blue = new Check(blueImage);
				panel2.add(blue);
				blue.setBounds(w, h, 60,60);
				blue.setId(id);
				blue.setColor("blue");
				blue.setX(w/60+1);
				blue.setY(h/60+1);
				StorageCheck.addCheck( id,blue);
				w+=120;
				id += 1;
				}
			}else{
				w = 0;
				for(int j = 1;j <= 5;j++){
				blue = new Check(blueImage);
				panel2.add(blue);
				blue.setBounds(w, h, 60, 60);
				blue.setId(id);
				blue.setColor("blue");
				blue.setX(w/60+1);
				blue.setY(h/60+1);
				StorageCheck.addCheck( id, blue);
				w+=120;
				id += 1;
				}
			}
			h+=60;
		}
	
//		Set set = StorageCheck.map.keySet();
//		Iterator it = set.iterator();
//		while(it.hasNext()){
//			int id = (int) it.next();
//			System.out.println(StorageCheck.getCheck(id).toString());
//		}
		this.getContentPane().add(panel2);
		panel2.setBounds(0, 0,600,600);
		this.setBounds(500, 30, 800,630);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����¼�����

		panel2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Point point = e.getPoint();
				int x = point.x/60+1;
				int y = point.y/60+1;
				
				//ͨ����������ȡ��ѡ�е�����
				Set set = StorageCheck.map.keySet();
				Iterator it = set.iterator();
				while(it.hasNext()){
					int id = (int) it.next();
					check = (Check)StorageCheck.getCheck(id);
					//ͨ�������ҵ���ѡ�е�qizi
					if(check.getX()==x&&check.getY()==y){
						
						//��treemap���ҵ�ѡ�е����ӣ�������ѭ��
						break;
					}else{
						//�����ָ���쳣
						check = null;
						System.out.println();
					}
				}
			}
		});
		
		//�����ƶ�
		btn2.addMouseListener(new MouseAdapter() {
			
			int x;
			int y;
			Point point = null;
			public void mouseClicked(MouseEvent e) {
				//�ƶ�����λ�������̼����л�ȡ
				System.out.println(check.toString());
				panel2.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
							point = e.getPoint();
							x = point.x/60+1;
							y = point.y/60+1;
							System.out.println(x+"::::::"+y);
							check.setX(x);
							check.setY(y);
							check.setBounds(point.x, point.y, 60, 60);
					}
				});
			}
		});
		
		//������ʧ
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
	
				check.setVisible(false);
				int id = check.getId();
				StorageCheck.removeCheck(id);
				
			}
		});
		
	}
}
