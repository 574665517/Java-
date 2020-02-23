package Redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * JedisPool 连接池,获得连接”和“释放资源”是非常消耗系统资源的两个过程，
 * 为了解决此类性能问题，通常会采用连接池技术，来共享连接，这样既不用每次都获取连接、释放连接了。
 * @author ywx
 * @ date 2020年1月9日
 */
public class RedisPoolTest {
	@Test
	public void testJedisPool() {
	    //1.创建一个配置对象
	    JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
	    jedisPoolConfig.setMaxTotal(50);    //最大连接数
	    jedisPoolConfig.setMaxIdle(10);     //最大空闲连接
	 
	    //2.创建jedis连接对象
	    JedisPool jedisPool = new JedisPool(jedisPoolConfig,"localhost",6379);
	 
	    //3.获取连接
	    Jedis jedis = jedisPool.getResource();
	 
	    //4.使用
	    jedis.set("name","oneStar");    //存储
	    String name = jedis.get("name");    //获取
	    System.out.println(name);
	 
	    //5.关闭连接(归还连接池)
	    jedis.close();
	}
	
}

