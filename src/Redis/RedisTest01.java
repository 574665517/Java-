package Redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest01 {//字符串类型 string
	@Test
	public void testString() {
	    //1.获取连接
	    Jedis jedis = new Jedis("localhost",6379);
	 
	    //2.操作数据
	    jedis.set("name","oneStar");    //存储
	    String name = jedis.get("name");      //获取
	    System.out.println(name);
	 
	    //可以使用setex()方法存储可以指定过期时间的 key value
	    jedis.setex("name",20,"twoStar");
	 
	    //3.关闭连接
	    jedis.close();
	}
	
}

