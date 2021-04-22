/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author violaboros.federico
 */
public class Studente implements Serializable{
    String nome, cognome;
    int numeroRegistro;

    public Studente(String nome, String cognome, int numeroRegistro) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return "Studente{" + "nome=" + nome + ", cognome=" + cognome + ", numeroRegistro=" + numeroRegistro + '}';
    }        
    
}
