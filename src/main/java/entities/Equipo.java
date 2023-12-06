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
        this.partidosJugados += partidosJugados;
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
        String nombre  = this.getNombre();
        String partidosJugados = String.valueOf(this.getPartidosJugados());
        String puntos = String.valueOf(this.getPuntos());
        int espaciosFaltantes = 16 - nombre.length();
        for (int i = 0; i < espaciosFaltantes; i++) {
            nombre = nombre + " ";
        }

        for (int i = 0; i < 8; i++) {
            partidosJugados = " " + partidosJugados + " ";
            puntos = " " + puntos;
        }



        return nombre + "-" + partidosJugados + " - " + puntos;
    }



    @Override
    void partidoGanado() {
        this.setPartidosJugados(1);
    }

    @Override
    void partidoPerdido() {
        this.setPartidosJugados(1);
    }

    @Override
    void partidoEmpatado() {
        this.setPartidosJugados(1);
    }

    @Override
    void puntosGanados() {
        setPuntos(3);
    }

    @Override
    void puntoEmpate() {
        setPuntos(1);
    }


}
