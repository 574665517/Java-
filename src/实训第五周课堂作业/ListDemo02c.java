package ʵѵ�����ܿ�����ҵ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListDemo02c {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		countFile(new File(""));
		long endTime = System.currentTimeMillis();
		System.out.println("\n����ʱ�䣺" + (endTime - startTime) + "����");
	}

    /**
     *
     * @param file
     */
	@SuppressWarnings("unused")
	public static void countFile(File file){
		
        BufferedReader bfr = null;   						//�����ַ���ȡ(����)��
        try{
            bfr = new BufferedReader(new FileReader(file));	//��������ֵ
            String value = null; 							//����һ����ʱ�����ļ��е��ַ�������
            String newValue = "";    						//�����ļ��������ַ����ı���
            while((value = bfr.readLine()) != null){    	//��ʼ��ȡ�ļ��е��ַ�
                newValue = newValue + value.toLowerCase();  //����newValue������,ȫ��ת����Сд����ϲ�ͳ��
            }
            int i = newValue.length();
            char[] ch = newValue.toCharArray();				//��newValue����ַ�����
            
            //����һ��TreeMap��Ĭ�ϴ�С����˳�򣬼���Ӧ�ַ���ֵ��Ӧ�ַ����ֵĴ���
            TreeMap<Character, Integer> map = new TreeMap<Character, Integer>(); 
            
            //����ch����ch�����е��ַ�����һ��Map������(TreeSet)������Ӧ�ַ���ֵ��Ӧ�ַ����ֵĴ���
            for(int x = 0; x < ch.length; x++) { 
                char c = ch[x];
                if(!map.containsKey(c)) {  					
                    map.put(c, 1);
                }
                else{
                	int count = map.get(c);
                	map.put(c, count + 1);
                }
            }
            //�������ȡ��TreeMap(map)�еļ���ֵ
            Set<Map.Entry<Character, Integer>> set = map.entrySet();
            Iterator<Map.Entry<Character, Integer>> iter = set.iterator();
            while(iter.hasNext()){
                Map.Entry<Character, Integer> maps = iter.next();
                char k = maps.getKey();
                int v = maps.getValue();
                System.out.println("��ĸ: "+  k   + " �������г�����("  + v +  "��)  ");
            }
        }
        catch(IOException e) {
           
        } finally {
            try {
                if(bfr != null)
                    bfr.close();
            }
            catch(IOException e) {
                
            }
        }
	}

}
