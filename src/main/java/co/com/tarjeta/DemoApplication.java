package co.com.tarjeta;

import co.com.tarjeta.entity.ClienteEntidad;
import co.com.tarjeta.entity.ProductEntity;
import co.com.tarjeta.entity.TarjetaCreditoEntidad;
import co.com.tarjeta.entity.UserEntity;
import co.com.tarjeta.repository.ProductRepositorio;
import co.com.tarjeta.repository.TarjetaCreditoRepositorio;
import co.com.tarjeta.repository.UserRepositorio;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

    @Autowired
    private ProductRepositorio productRepository;
    @Autowired
    private TarjetaCreditoRepositorio tarjetaCreditoRepositorio;
    @Autowired
    private UserRepositorio repository;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
        return () -> {

            productRepository.save(new ProductEntity("Computador", "Gamer Acer Nitro", 20000));
            productRepository.save(new ProductEntity("Teclado", "Logitech Mk235", 30000));
            String uuid = UUID.randomUUID().toString();
            tarjetaCreditoRepositorio.save(new TarjetaCreditoEntidad("VISA", uuid, new Date(), "2020", "123", new ClienteEntidad("John", "Ochoa", "4601179", "CRA..", "TRANSV.", "Bogota", "La Estancia", "Colombia", new Date())));
            tarjetaCreditoRepositorio.save(new TarjetaCreditoEntidad("MASTERCARD", uuid, new Date(), "2022", "123", new ClienteEntidad("Jairo", "Mesa", "4601180", "CALLE...", "AV..", "Medellin", "Poblado", "Colombia", new Date())));

            List<UserEntity> users = Stream.of(
                    new UserEntity("user1", "pwd1", "user1@gmail.com", new Date()),
                    new UserEntity("user2", "pwd2", "user2@gmail.com", new Date()),
                    new UserEntity("user3", "pwd3", "user3@gmail.com", new Date())
            ).collect(Collectors.toList());
            repository.saveAll(users);

        };
    }

}
