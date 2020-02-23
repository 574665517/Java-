package 实训第三周课堂作业a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ywx
 * @ date 2019年5月31日
 */
enum Week {Sun, Mon, Tue, Wed, Thu, Fri, Sat}//五天工作制变六天,下面代码有问题吗?报错
public class AsListTest {
	/**
	 * 这是由于Arrays.asList()返回的是Arrays的内部类ArrayList， 而不是java.util.ArrayList
	 * Arrays的内部类ArrayList和java.util.ArrayList都是继承AbstractList，remove、add等方法
	 * 在AbstractList中是默认throw UnsupportedOperationException而且不作任何操作
	 * @param args
	 */
	public static void main(String[]args){
		//五天工作制
		Week[] workDays = {Week.Mon, Week.Tue, Week.Wed, Week.Thu, Week.Fri};//数组转成集合
		//转换为列表
		List<Week>list = Arrays.asList(workDays);
		List<Week> arrList = new ArrayList(list);//解决方法
		//增加周六也为工作日
		//list.add(Week.Sat);//Exception in thread "main" java.lang.UnsupportedOperationException
		arrList.add(Week.Sat);
		/*工作日开始干活了*/
	}
}
