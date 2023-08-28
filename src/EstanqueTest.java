/*
  Esta clase es un test de la clase Estanque.
  Se ha creado siguiendo las indicaciones del enunciado del práctico
 */
public class EstanqueTest {
    public static void main(String[] args) {
        //	Crear un objeto Estanque y verificar que se encuentra vacío.
        Estanque estanque1 = new Estanque(3.2f,2.5f);
        System.out.println("está vacío: "+ (estanque1.getCapacidadOcupada()==0));
        //	Agregar un volumen igual a la mitad de la capacidad disponible
        //	y desplegar el nivel de llenado.
        estanque1.agrega(estanque1.getCapacidadDisponible()/2);
        System.out.println("Nivel de llenado: "+estanque1.getAlturaLlenado());

        //	Extraer un volumen superior a la capacidad ocupada en el estanque
        //	y desplegar un mensaje apropiado.
        if(estanque1.extrae(estanque1.getCapacidadOcupada()+1)){
            System.out.println("Se ha extraído correctamente "+(estanque1.getCapacidadDisponible()+1)+" m3");
        }else{
            System.out.println("No fue posible extraer el volumen solicitado");
        }
        //	Extraer todo el material almacenado en el estanque
        //	 y verificar que este ha quedado vacío.
        estanque1.extrae(estanque1.getCapacidadOcupada());
        System.out.println("capacidad ocupada (debe ser 0): "+ estanque1.getCapacidadOcupada());

        //	Agregar un volumen superior a la capacidad total del estanque
        //	y desplegar un mensaje apropiado.
        if(!estanque1.agrega(1+
                estanque1.getCapacidadOcupada()+
                estanque1.getCapacidadDisponible())){
            System.out.println("no es posible agregar ese volumen en el estanque");
        }

        //	Crear 2 objetos Estanque, uno cuyas dimensiones sean el doble
        //	del primer estanque creado y el otro con las mismas dimensiones
        //	del primero.
        Estanque estanque2=new Estanque(6.4f, 5f);
        Estanque estanque3=new Estanque(3.2f, 2.5f);

        //	Comparar los objetos 1 y 2 verificando que no son iguales, luego compare los objetos 1 y 3, verifique que estos últimos son iguales. Despliegue mensajes apropiados.
        System.out.println("Estanque 1 y 2 no son iguales "+
                estanque1.equals(estanque2));
        System.out.println("Estanque 1 y 3 son iguales "+
                estanque1.equals(estanque3));
    }
}
