package com.facebook.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.facebook.models.User;

@Repository  // quando utilizamos o JpaRepository ele reconhece por padrao q a interface é do tipo repository, mas coloquei aqui dnv.
public interface UserRepository extends JpaRepository<User, UUID> {

}


