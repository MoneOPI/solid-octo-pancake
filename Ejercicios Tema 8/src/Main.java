public class Main {
    public static void main(String[] args) throws Exception {

        Persona humano = new Persona();
        humano.setEdad(20);
        humano.setNombre("Sergio");
        humano.setTelefono(1568123689);
        System.out.println(humano.getNombre());
        System.out.println(humano.getEdad());
        System.out.println(humano.getTelefono());

 }
   
    }
      


class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}