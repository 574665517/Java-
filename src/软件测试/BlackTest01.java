package 软件测试;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BlackTest01 extends BlackTest03 {
	
	public BlackTest01() {
		init();
	}

public void init() {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	long timeNow = System.currentTimeMillis();
	long timeLose = System.currentTimeMillis() + 2 * 60 * 60 * 1000;
//	System.out.println(timeNow + "  " + timeNow);

//	String dateNow = sdf.format(new Date(timeNow));
	String loseDate = sdf.format(new Date(timeLose));

//	System.out.println("错误时间 = " + dateNow + "    错误失效时间为 = " + loseDate);

        int m = 5;//总共五次输入账号密码的机会
        
        while (true) {
        	
            System.out.println("请输入用户名：");
            Scanner scan = new Scanner(System.in);
            String username = scan.nextLine();
            
            System.out.println("请输入密码：");            
            Scanner scan1 = new Scanner(System.in);
            String password = scan1.nextLine();
            
            if (username.equals("xx") && password.equals("123")) {
                System.out.println("登陆成功");
                break;
            } else {
                if(m == 1) {
                	System.out.println("冻结登录");
                	System.out.println("错误五次，冻结到" + loseDate + "停止");
                	break;
                } 
                System.out.println("输入错误，你还有"+ (m - 1) +"次机会！");
                m--;
            }
            
        }
}
    public static void main(String[] args) {
	     new BlackTest01();
    }
}