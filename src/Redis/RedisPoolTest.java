package Redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * JedisPool ���ӳ�,������ӡ��͡��ͷ���Դ���Ƿǳ�����ϵͳ��Դ���������̣�
 * Ϊ�˽�������������⣬ͨ����������ӳؼ��������������ӣ������Ȳ���ÿ�ζ���ȡ���ӡ��ͷ������ˡ�
 * @author ywx
 * @ date 2020��1��9��
 */
public class RedisPoolTest {
	@Test
	public void testJedisPool() {
	    //1.����һ�����ö���
	    JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
	    jedisPoolConfig.setMaxTotal(50);    //���������
	    jedisPoolConfig.setMaxIdle(10);     //����������
	 
	    //2.����jedis���Ӷ���
	    JedisPool jedisPool = new JedisPool(jedisPoolConfig,"localhost",6379);
	 
	    //3.��ȡ����
	    Jedis jedis = jedisPool.getResource();
	 
	    //4.ʹ��
	    jedis.set("name","oneStar");    //�洢
	    String name = jedis.get("name");    //��ȡ
	    System.out.println(name);
	 
	    //5.�ر�����(�黹���ӳ�)
	    jedis.close();
	}
	
}

