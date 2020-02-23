package 封装类;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行失败，报空指针异常，我们稍稍思考一下很快就知道原因了：在程序的for循环中，
 * 隐含了一个拆箱过程，再此过程中包装类型转换为了基本类型。
 * 我们知道拆箱过程是通过调用包装对象的intValue方法来实现的，由于包装对象是null值，
 * 访问其intValue方法报空指针异常也就在所难免了。
 * 问题找到了，那就解决。（即加入null值检查即可
 * @author ywx
 * @ date 2019年6月16日
 */

public class Ceshi {
    // 计算list中所有元素之和
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

