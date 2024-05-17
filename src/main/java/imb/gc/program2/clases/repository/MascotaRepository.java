package imb.gc.program2.clases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imb.gc.program2.clases.entity.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {

}
