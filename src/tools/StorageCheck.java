package tools;

import java.util.HashMap;

import Checker.Check;
/*
 * ʹ��hashmap���洢���ɵ����������
 * */
public class StorageCheck {
	public static HashMap map = new HashMap<>();
	//�����Ӷ�����ӵ�map
	public static void addCheck(int id,Check check){
		map.put(id,check);
	}
	//�����Ӷ����Ƴ�
	public static void removeCheck(int id){
		map.remove(id);
	}
	//ͨ��id��ȡ���Ӷ���
	public static Check getCheck(int id){
		return  (Check)map.get(id);
	}
}
