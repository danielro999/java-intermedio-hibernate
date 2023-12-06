package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

public abstract class EquipoAbstracto {


    public void enfrentamiento (Equipo contrincante, int golesAFavor, int golesEnContra){
        if (golesEnContra > golesAFavor){
            this.partidoPerdido();
            System.out.println("perdio " + this);
        } else if (golesEnContra < golesAFavor) {
            this.partidoGanado();
            this.puntosGanados();
            System.out.println("gano " + this);
        }else {
            this.partidoEmpatado();
            this.puntoEmpate();
            System.out.println("empate");

        }
    }
    abstract void partidoGanado ();
    abstract void partidoPerdido ();
    abstract void partidoEmpatado ();
    abstract void puntosGanados ();
    abstract void puntoEmpate ();
}
