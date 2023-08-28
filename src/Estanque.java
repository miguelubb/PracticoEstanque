
public class Estanque {
    //atributos
    private float altura;
    private float radio;
    private float alturaLlenado;

    //métodos.
    public Estanque(float altura, float radio) {
        this.altura = altura;
        this.radio = radio;
        alturaLlenado=0;
    }

    public boolean agrega(float volumen){
        if(volumen>getCapacidadDisponible()){
            return false;
        }
        alturaLlenado=
                (float)((getCapacidadOcupada()+volumen) /
                        (radio * radio * Math.PI));
        return true;
    }

    public boolean extrae(float volumen){
        if((getCapacidadOcupada()-volumen)<0){
            return false;
        }
        alturaLlenado=(float)((getCapacidadOcupada()-volumen)/
                (radio * radio * Math.PI));
        return true;
    }

    public float getAlturaLlenado() {
        return alturaLlenado;
    }

    public float getCapacidadOcupada(){
        return (float)(radio * radio * Math.PI)*alturaLlenado;
    }

    public float getCapacidadDisponible(){
        float volumen=(float)(radio * radio * Math.PI)*altura;
        return volumen-getCapacidadOcupada();
    }

    public boolean equals(Estanque otro){
        return altura==otro.altura && radio==otro.radio;
    }

}
