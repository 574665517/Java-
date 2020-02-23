package Redis;

import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;

class RedisTest {

	@Test
    public void testJedisConnect() {
//        连接redis服务器
        Jedis jedis = new Jedis("192.168.0.1", 6379);
//        测试redis服务器是否在运行
        System.out.println(jedis.ping());
        System.out.println(jedis.info());
        
    }

}
