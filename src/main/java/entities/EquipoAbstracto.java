package entities;

public abstract class EquipoAbstracto {
    public void enfrentamiento (Equipo contrincante, int golesAFavor, int golesEnContra){
        if (golesEnContra > golesAFavor){

        }
    };
    abstract void partidoGanado ();
    abstract void partidoPerdido ();
    abstract void partidoEmpatado ();
    abstract void puntosGanados ();
    abstract void puntoEmpate ();
}
