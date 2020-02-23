package Redis;

import java.util.List;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest03 {//�б����� list
	@Test
	public void testList(){
	    //1.��ȡ����
	    Jedis jedis = new Jedis();  //���ʹ�ÿղι��죬Ĭ��ֵ "localhost",6379�˿�
	 
	    //2.��������
	    //�洢
	    jedis.lpush("mylist","a","b","c");//����ߴ�
	    jedis.rpush("mylist","a","b","c");//���ұߴ�
	 
	    // list ��Χ��ȡ
	    List<String> mylist = jedis.lrange("mylist", 0, -1);
	    System.out.println(mylist);
	 
	    // list ������ɾ����
	    String element1 = jedis.lpop("mylist");     //������ߵ�c
	    System.out.println(element1);
	    String element2 = jedis.rpop("mylist");     //�����ұߵ�c
	    System.out.println(element2);
	 
	    // list ��Χ��ȡ
	    List<String> mylist2 = jedis.lrange("mylist", 0, -1);
	    System.out.println(mylist2);
	 
	    //3.�ر�����
	    jedis.close();
	}
	
}

