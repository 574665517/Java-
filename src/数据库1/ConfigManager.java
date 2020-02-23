package 数据库1;

import java.io.InputStream;
import java.util.Properties;

//读取配置文件的工具类-单例模式应用
public class ConfigManager {
	private static ConfigManager configManager;
	private static Properties properties;
	private ConfigManager() {
		String configFile = "jdbc.properties";
		properties = new Properties();
		InputStream is = ConfigManager.class.getClassLoader().getResourceAsStream(configFile);
		try {
			properties.load(is);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	public static ConfigManager getInstance() {
		if (configManager == null) {
			configManager = new ConfigManager();
		}
		return configManager;
	}
	public String getString(String key) {
		return properties.getProperty(key);
	}

}