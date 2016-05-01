package com.grapheople.lifeisquest.dao;

import com.grapheople.lifeisquest.domain.Quest;
import com.grapheople.lifeisquest.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Steven Jee
 * @since v.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
