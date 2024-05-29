package GestionePrenotazioni.PrenotazioneDispositivo.repository;


import GestionePrenotazioni.PrenotazioneDispositivo.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, String> {
}
