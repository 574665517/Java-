package Redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest01 {//�ַ������� string
	@Test
	public void testString() {
	    //1.��ȡ����
	    Jedis jedis = new Jedis("localhost",6379);
	 
	    //2.��������
	    jedis.set("name","oneStar");    //�洢
	    String name = jedis.get("name");      //��ȡ
	    System.out.println(name);
	 
	    //����ʹ��setex()�����洢����ָ������ʱ��� key value
	    jedis.setex("name",20,"twoStar");
	 
	    //3.�ر�����
	    jedis.close();
	}
	
}

