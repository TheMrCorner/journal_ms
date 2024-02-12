package com.mrcorner.journal.monthly.repository;

import com.mrcorner.journal.monthly.model.Habits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitsRepository extends JpaRepository<Habits, Integer> {

    List<Habits> findAllByIdHabitIn(List<Integer> idHabits);

}
