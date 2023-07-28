package tp.quiz.repository;

import tp.quiz.entity.Countrie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountrieRepository extends JpaRepository<Countrie, Integer> {

}