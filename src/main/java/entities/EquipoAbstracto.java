package entities;

public abstract class EquipoAbstracto {


    public void enfrentamiento (Equipo contrincante, int golesAFavor, int golesEnContra){
        if (golesEnContra > golesAFavor){
            this.partidoPerdido();
        } else if (golesEnContra < golesAFavor) {
            this.partidoGanado();
            this.puntosGanados();
        }else {
            this.partidoEmpatado();
            this.puntoEmpate();
        }
    }
    abstract void partidoGanado ();
    abstract void partidoPerdido ();
    abstract void partidoEmpatado ();
    abstract void puntosGanados ();
    abstract void puntoEmpate ();
}
