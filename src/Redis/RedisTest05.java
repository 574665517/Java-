package Redis;

import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest05 {//有序集合类型 sortedset
	@Test
	public void testSortedset(){
	    //1.获取连接
	    Jedis jedis = new Jedis();  //如果使用空参构造，默认值 "localhost",6379端口
	 
	    //2.操作数据
	    // Sortedset 存储
	    jedis.zadd("mysortedset",18,"oneStar");
	    jedis.zadd("mysortedset",16,"twoStar");
	    jedis.zadd("mysortedset",55,"threeStar");
	 
	    // Sortedset 获取
	    Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
	    System.out.println(mysortedset);
	 
	    //3. 关闭连接
	    jedis.close();
	}
	
}

