package com.grapheople.lifeisquest.dao;

import com.grapheople.lifeisquest.domain.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pax on 2016. 5. 2..
 */
public interface QuestRepository extends JpaRepository<Quest, Long> {
}
