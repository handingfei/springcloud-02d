package com.hdf.upmsbizjpaeureka;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class UpmsBizJpaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsBizJpaEurekaApplication.class, args);
    }

}
