package imb.gc.program2.clases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imb.gc.program2.clases.entity.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {

}
