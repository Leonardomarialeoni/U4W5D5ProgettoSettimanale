package GestionePrenotazioni.PrenotazioneDispositivo.repository;


import GestionePrenotazioni.PrenotazioneDispositivo.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {
}