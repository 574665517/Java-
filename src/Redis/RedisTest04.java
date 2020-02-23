package Redis;

import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest04 {//集合类型 set
	@Test
	public void testSet(){
	    //1.获取连接
	    Jedis jedis = new Jedis();  //如果使用空参构造，默认值 "localhost",6379端口
	 
	    //2.操作数据
	    // set 存储
	    jedis.sadd("myset","a","b","c");
	    // set 获取
	    Set<String> myset = jedis.smembers("myset");
	    System.out.println(myset);
	 
	    //3. 关闭连接
	    jedis.close();
	}
	
}

