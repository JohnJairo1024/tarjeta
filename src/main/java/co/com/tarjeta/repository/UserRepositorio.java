package co.com.tarjeta.repository;


import co.com.tarjeta.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositorio extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUserName(String username);
}