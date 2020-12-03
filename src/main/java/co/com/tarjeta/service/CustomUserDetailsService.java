package co.com.tarjeta.service;


import co.com.tarjeta.entity.UserEntity;
import co.com.tarjeta.repository.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepositorio repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = repository.findByUserName(username);
        return new org.springframework.security.core.userdetails.User(userEntity.getUserName(), userEntity.getPassword(), new ArrayList<>());
    }
}
