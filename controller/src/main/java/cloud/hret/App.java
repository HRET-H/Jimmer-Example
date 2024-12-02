package cloud.hret;

import org.babyfish.jimmer.client.EnableImplicitApi;
import org.babyfish.jimmer.sql.EnableDtoGeneration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动类.
 *
 * @author HRET
 * @date 2024/11/30
 * @version 1.0
 */
@EnableDtoGeneration
@EnableImplicitApi
@SpringBootApplication
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
