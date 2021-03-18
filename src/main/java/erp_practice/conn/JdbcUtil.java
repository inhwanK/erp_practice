package erp_practice.conn;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {

	public static Connection getConnection() {

		String connPath = "db.properties";
		Connection prop = null;
		try (InputStream in = ClassLoader.getSystemResourceAsStream(connPath)) {
			Properties db = new Properties();
			db.load(in);
			prop = DriverManager.getConnection(db.getProperty("url"), db);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
