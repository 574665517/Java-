package ��װ��;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ʧ�ܣ�����ָ���쳣����������˼��һ�ºܿ��֪��ԭ���ˣ��ڳ����forѭ���У�
 * ������һ��������̣��ٴ˹����а�װ����ת��Ϊ�˻������͡�
 * ����֪�����������ͨ�����ð�װ�����intValue������ʵ�ֵģ����ڰ�װ������nullֵ��
 * ������intValue��������ָ���쳣Ҳ�����������ˡ�
 * �����ҵ��ˣ��Ǿͽ������������nullֵ��鼴��
 * @author ywx
 * @ date 2019��6��16��
 */

public class Ceshi {
    // ����list������Ԫ��֮��
    public static int f(List<Integer> list) {
        int count = 0;
//        for (int i : list) {
        for(Integer i : list) {
//            count += i;
        	count += (null != i) ? i : 0;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(null);
        System.out.println(f(list));
    }
}

