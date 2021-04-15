/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

/**
 *
 * @author violaboros.federico
 */
public class Studente {
    String nome, cognome;
    int numeroRegistro;

    public Studente(String nome, String cognome, int numeroRegistro) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
        
}
