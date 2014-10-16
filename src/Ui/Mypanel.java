package Ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Mypanel extends JPanel{
	Graphics2D  g2;
	protected void paintComponent(Graphics g) {
		int w = 0;//ºá×ø±ê
		  int h = 0;//×Ý×ø±ê
		  for(int i=1;i<=10;i++) {
			  w = 0;
			  if(i%2==1){
			    for(int j=1;j<=10;j++){
			          if(j%2==0){
			        	  g.setColor(Color.red);
			        	  g.fillRect(w, h, 60, 60);
			          }else{
			        	  g.setColor(Color.blue);
			        	  g.fillRect(w, h, 60, 60);
			          }
			          w+=60;
			        }
			    h+=60;
			  }else{
				    for(int j=1;j<=10;j++){
				          
				          if(j%2==1){
				        	  g.setColor(Color.red);
				        	  g.fillRect(w, h, 60, 60);
				          }else{
				        	  g.setColor(Color.blue);
				        	  g.fillRect(w, h, 60, 60);
				          }
				          w+=60;
				        }
				    h+=60;
				  }
		     }
		 }
	}

