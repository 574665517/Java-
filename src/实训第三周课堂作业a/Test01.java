package 实训第三周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月31日
 */
public class Test01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		//X，表达式1是char类型，表达式2是int类型常量，0也可以用char类型表示。所以整个条件运算符结果类型就是char类型
		System.out.println(true ? x : 65536);//88，表达式2是int类型，超出了char的范围，因此要进行类型提升为int
		System.out.println(true ? x : i);//88，表达式1是char类型，表达式2是int类型，因此要提升类型为int类型
		System.out.println(false ? 0 : x);//X，表达式1是int类型常量可以0用char类型表示，所以整个条件运算符结果类型是char类型
		System.out.println(false ? i : x);//88，表达式1是int类型，表达式2是char类型，因此要进行类型的提升为int类型
	}
}
