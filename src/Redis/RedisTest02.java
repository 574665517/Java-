package Redis;

import java.util.Map;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest02 {//��ϣ���� hash
	@Test
	public void testHash(){
	    //1.��ȡ����
	    Jedis jedis = new Jedis();//���ʹ�ÿղι��죬Ĭ��ֵ "localhost",6379�˿�
	    //2.��������
	    jedis.hset("user","name","oneStar");    //�洢
	    jedis.hset("user","age","18");
	    jedis.hset("user","email","onestarlr@hotmail.com");
	    String name = jedis.hget("user","name");    //��ȡ
	    String age = jedis.hget("user","age");
	    String email = jedis.hget("user","email");
	    System.out.println(name + age + email);
	 
	    // ��ȡhash������map�е�����
	    Map<String, String> user = jedis.hgetAll("user");
	    // keyset
	    Set<String> keySet = user.keySet();
	    for (String key : keySet) {
	        //��ȡvalue
	        String value = user.get(key);
	        System.out.println(key + ":" + value);
	    }
	    //3.�ر�����
	    jedis.close();
	}
	
}

