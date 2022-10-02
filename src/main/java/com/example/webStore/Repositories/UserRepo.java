package com.example.webStore.Repositories;

import com.example.webStore.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
