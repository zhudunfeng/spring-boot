package smoketest.simple;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {
   public static void main(String[] args) {
      System.out.println("Spring Boot 源码剖析之源码环境搭建验证");
      SpringApplication.run(DemoApplication.class, args);
      System.out.println("Spring Boot 源码剖析之源码环境搭建验证成功");
   }
}
