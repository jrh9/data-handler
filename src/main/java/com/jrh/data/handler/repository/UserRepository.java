package com.jrh.data.handler.repository;

import com.jrh.data.handler.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
