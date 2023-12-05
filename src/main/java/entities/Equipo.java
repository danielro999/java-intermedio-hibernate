package entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table( name = "equipos")
public class Equipo extends EquipoAbstracto implements Serializable  {
    @Id
    private String nombre;
    @Column(name = "director_tecnico")
    private String directorTecnico;
    @Column(name = "partidos jugados")
    private int partidosJugados;
    private int puntos;
    private int suplentes;
    private int titulares;

    public Equipo(){}
    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getSuplentes() {
        return suplentes;
    }

    public void setSuplentes(int suplentes) {
        this.suplentes = suplentes;
    }

    public int getTitulares() {
        return titulares;
    }

    public void setTitulares(int titulares) {
        this.titulares = titulares;
    }

    @Override
    public String toString() {
        return this.getNombre() + " - " + this.getPartidosJugados() + " - " + this.getPuntos();
    }

    @Override
    public void enfrentamiento(Equipo visitante, int golesLocal, int golesVisitante) {

    }

    @Override
    void partidoGanado() {

    }

    @Override
    void partidoPerdido() {

    }

    @Override
    void partidoEmpatado() {

    }

    @Override
    void puntosGanados() {

    }

    @Override
    void puntoEmpate() {

    }


}
