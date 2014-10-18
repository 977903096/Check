package Checker;
/*
 * 定义棋子类，属性：id,color,x,y;
 * */

public class Check {
		private int id;
		private String color;
		private int x;
		private int y;
		//构造函数
		
		public Check(int id, String color, int x, int y) {
			
			this.id = id;
			this.color = color;
			this.x = x;
			this.y = y;
		}
		public Check() {
			
		}
		//set与get方法
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		//tostring方法
		@Override
		public String toString() {
			return "Check ：[id=" + id + ", color=" + color + ", x=" + x + ", y="
					+ y + "]";
		}
}
