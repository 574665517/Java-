package Redis;

import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;

class RedisTest {

	@Test
    public void testJedisConnect() {
//        ����redis������
        Jedis jedis = new Jedis("192.168.0.1", 6379);
//        ����redis�������Ƿ�������
        System.out.println(jedis.ping());
        System.out.println(jedis.info());
        
    }

}
