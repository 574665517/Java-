package Redis;

import java.util.List;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest03 {//列表类型 list
	@Test
	public void testList(){
	    //1.获取连接
	    Jedis jedis = new Jedis();  //如果使用空参构造，默认值 "localhost",6379端口
	 
	    //2.操作数据
	    //存储
	    jedis.lpush("mylist","a","b","c");//从左边存
	    jedis.rpush("mylist","a","b","c");//从右边存
	 
	    // list 范围获取
	    List<String> mylist = jedis.lrange("mylist", 0, -1);
	    System.out.println(mylist);
	 
	    // list 弹出（删除）
	    String element1 = jedis.lpop("mylist");     //弹出左边的c
	    System.out.println(element1);
	    String element2 = jedis.rpop("mylist");     //弹出右边的c
	    System.out.println(element2);
	 
	    // list 范围获取
	    List<String> mylist2 = jedis.lrange("mylist", 0, -1);
	    System.out.println(mylist2);
	 
	    //3.关闭连接
	    jedis.close();
	}
	
}

