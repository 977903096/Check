package tools;

import java.util.HashMap;
import java.util.TreeMap;

import checker.Check;
/*
 * 使用hashmap，存储生成的棋子类对象
 * */
public class StorageCheck {
	public static TreeMap map = new TreeMap<>();
	//将棋子对象添加到map
	public static void addCheck(int id,Check check){
		map.put(id,check);
	}
	//将棋子对象移除
	public static void removeCheck(int id){
		map.remove(id);
	}
	//通过id获取棋子对象
	public static Check getCheck(int id){
		return  (Check)map.get(id);
	}
	
}
