package denisjulio.blogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestBlogApiApplication {

  public static void main(String[] args) {
    SpringApplication.from(BlogApiApplication::main).with(TestBlogApiApplication.class).run(args);
  }

}
