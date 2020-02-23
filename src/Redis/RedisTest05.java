package Redis;

import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest05 {//���򼯺����� sortedset
	@Test
	public void testSortedset(){
	    //1.��ȡ����
	    Jedis jedis = new Jedis();  //���ʹ�ÿղι��죬Ĭ��ֵ "localhost",6379�˿�
	 
	    //2.��������
	    // Sortedset �洢
	    jedis.zadd("mysortedset",18,"oneStar");
	    jedis.zadd("mysortedset",16,"twoStar");
	    jedis.zadd("mysortedset",55,"threeStar");
	 
	    // Sortedset ��ȡ
	    Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
	    System.out.println(mysortedset);
	 
	    //3. �ر�����
	    jedis.close();
	}
	
}

