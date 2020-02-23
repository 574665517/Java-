package Redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisPoolTest01 {
	@Test
	public void testJedisPoolUtil(){
	    //1.通过连接池工具获取
	    Jedis jedis = JedisPoolUtil.getJedisPool();
	 
	    //2.使用
	    jedis.set("name","LSTAR");    //存储
	    String name = jedis.get("name");    //获取
	    System.out.println(name);
	 
	    //3.关闭连接(归还连接池)
	    jedis.close();
	}
	
}

