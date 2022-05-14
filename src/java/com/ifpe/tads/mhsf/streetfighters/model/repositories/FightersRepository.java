package com.ifpe.tads.mhsf.streetfighters.model.repositories;

import com.ifpe.tads.mhsf.streetfighters.model.business.Lutador;

import java.util.ArrayList;
import java.util.List;

public class FightersRepository {
    // Singleton:
    private static FightersRepository currentInstance;
    private final List<Lutador> fighters;
    private static int currentId = 1;

    private FightersRepository() {
        fighters = new ArrayList<Lutador>();
    }

    public static FightersRepository getInstance() {
        if (currentInstance == null) {
            currentInstance = new FightersRepository();
        }
        return currentInstance;
    }

    // Methods:
    public List<Lutador> getAllFighters() {
        return fighters;
    }

    public Lutador getFighterById(int id) {
        Lutador desiredFighter = null;
        for (Lutador fighter : fighters) {
            if (fighter.getId() == id) {
                desiredFighter = fighter;
                break;
            }
        }
        return desiredFighter;
    }

    public void addFighter(Lutador fighter) {
        fighter.setId(currentId++);
        fighters.add(fighter);
    }

    public void editFighter(Lutador editedFighter) {
        for (Lutador fighter : fighters) {
            if (fighter.getId() == editedFighter.getId()) {
                fighter.setAltura(editedFighter.getAltura());
                fighter.setApelido(editedFighter.getApelido());
                fighter.setArtMarcial(editedFighter.getArtMarcial());
                fighter.setCurso(editedFighter.getCurso());
                fighter.setDestro(editedFighter.isDestro());
                fighter.setContatoEmergencia(editedFighter.getContatoEmergencia());
                fighter.setNascimento(editedFighter.getNascimento());
                fighter.setNome(editedFighter.getNome());
                fighter.setPeso(editedFighter.getPeso());
                fighter.setSenha(editedFighter.getSenha());
                break;
            }
        }
    }

    public void deleteFighterById(int id) {
        Lutador fighterToBeRemoved = null;
        for (Lutador fighter : fighters) {
            if (fighter.getId() == id) {
                fighterToBeRemoved = fighter;
                break;
            }
        }
        fighters.remove(fighterToBeRemoved);
    }

}
