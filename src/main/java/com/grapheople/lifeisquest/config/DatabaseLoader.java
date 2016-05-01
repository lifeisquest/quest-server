package com.grapheople.lifeisquest.config;

import com.grapheople.lifeisquest.dao.UserRepository;
import com.grapheople.lifeisquest.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Steven Jee
 * @since v.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

  private final UserRepository repository;

  @Autowired
  public DatabaseLoader(UserRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(String... strings) throws Exception {
    this.repository.save(new User("magmacannon@gmail.com", "wjdwlgur8465"));
  }
}
