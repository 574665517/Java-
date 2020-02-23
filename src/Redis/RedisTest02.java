package Redis;

import java.util.Map;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest02 {//哈希类型 hash
	@Test
	public void testHash(){
	    //1.获取连接
	    Jedis jedis = new Jedis();//如果使用空参构造，默认值 "localhost",6379端口
	    //2.操作数据
	    jedis.hset("user","name","oneStar");    //存储
	    jedis.hset("user","age","18");
	    jedis.hset("user","email","onestarlr@hotmail.com");
	    String name = jedis.hget("user","name");    //获取
	    String age = jedis.hget("user","age");
	    String email = jedis.hget("user","email");
	    System.out.println(name + age + email);
	 
	    // 获取hash的所有map中的数据
	    Map<String, String> user = jedis.hgetAll("user");
	    // keyset
	    Set<String> keySet = user.keySet();
	    for (String key : keySet) {
	        //获取value
	        String value = user.get(key);
	        System.out.println(key + ":" + value);
	    }
	    //3.关闭连接
	    jedis.close();
	}
	
}

