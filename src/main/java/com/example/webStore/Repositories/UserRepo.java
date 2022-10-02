package com.example.webStore.Repositories;

import com.example.webStore.Models.Usr;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Usr, Long> {
}
