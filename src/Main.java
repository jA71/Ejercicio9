public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(28);
        cliente.setNombre("Javier");
        cliente.setTelefono(573863);
        cliente.setCredito(5000);
        System.out.println(cliente.getEdad()+" "+ cliente.getTelefono()+" "+cliente.getNombre()+" "+cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(1500);
        System.out.println(trabajador.getSalario());
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona{
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }

}

class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}