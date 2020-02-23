package Redis;

import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest04 {//�������� set
	@Test
	public void testSet(){
	    //1.��ȡ����
	    Jedis jedis = new Jedis();  //���ʹ�ÿղι��죬Ĭ��ֵ "localhost",6379�˿�
	 
	    //2.��������
	    // set �洢
	    jedis.sadd("myset","a","b","c");
	    // set ��ȡ
	    Set<String> myset = jedis.smembers("myset");
	    System.out.println(myset);
	 
	    //3. �ر�����
	    jedis.close();
	}
	
}

