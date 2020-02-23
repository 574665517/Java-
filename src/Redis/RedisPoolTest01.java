package Redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisPoolTest01 {
	@Test
	public void testJedisPoolUtil(){
	    //1.ͨ�����ӳع��߻�ȡ
	    Jedis jedis = JedisPoolUtil.getJedisPool();
	 
	    //2.ʹ��
	    jedis.set("name","LSTAR");    //�洢
	    String name = jedis.get("name");    //��ȡ
	    System.out.println(name);
	 
	    //3.�ر�����(�黹���ӳ�)
	    jedis.close();
	}
	
}

