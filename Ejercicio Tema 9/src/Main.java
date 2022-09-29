public class Main {
    public static void main(String[] args) throws Exception {
        Cliente clienteUno = new Cliente();
        clienteUno.setNombre("Javier");
        clienteUno.setEdad(26);
        clienteUno.setTelefono(562114);
        clienteUno.setCredito(650);
        System.out.println(clienteUno.getNombre());
        System.out.println(clienteUno.getEdad() + " años");
        System.out.println("Telefono: " + clienteUno.getTelefono());
        System.out.println("Credito: " + clienteUno.getCredito());

        Trabajador trabajadorUno = new Trabajador();
        trabajadorUno.setNombre("Martin");
        trabajadorUno.setEdad(38);
        trabajadorUno.setTelefono(970412);
        trabajadorUno.setSalario(35000);
        System.out.println(trabajadorUno.getNombre());
        System.out.println(trabajadorUno.getEdad() + " años");
        System.out.println("Telefono: " + trabajadorUno.getTelefono());
        System.out.println("Salario: " + trabajadorUno.getSalario());
    }

    static class Persona{
        int Edad;
        String Nombre;
        int Telefono;
        public int getEdad() {
            return Edad;
        }
        public void setEdad(int edad) {
            Edad = edad;
        }
        public String getNombre() {
            return Nombre;
        }
        public void setNombre(String nombre) {
            Nombre = nombre;
        }
        public int getTelefono() {
            return Telefono;
        }
        public void setTelefono(int telefono) {
            Telefono = telefono;
        }
        
    }

    static class Cliente extends Persona{
        float Credito;

        public float getCredito() {
            return Credito;
        }

        public void setCredito(float credito) {
            Credito = credito;
        }
    }

    static class Trabajador extends Persona{
        float Salario;

        public float getSalario() {
            return Salario;
        }

        public void setSalario(float salario) {
            Salario = salario;
        }
    }


}
