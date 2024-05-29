package GestionePrenotazioni.PrenotazioneDispositivo.repository;



import GestionePrenotazioni.PrenotazioneDispositivo.entities.Postazione;
import GestionePrenotazioni.PrenotazioneDispositivo.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);
}