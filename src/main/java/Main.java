import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Nico", "Fernandez", "222222");
        Persona persona1 = new Persona("Nombre2", "Apellido2", "222222");
        Persona persona2 = new Persona("Nombre3", "Apellido3", "1111111");

        Motor motor = new Motor(32, 23);
        Chasis chasis = new Chasis(2323, "dskc");
        Automovil automovil = new Automovil("kjcds", "csdcsd", 2002, 20, motor, chasis);
        GestorDePersonal gestorDePersonal = new GestorDePersonal();
        gestorDePersonal.agregarPersona(persona);
        gestorDePersonal.agregarPersona(persona1);
        gestorDePersonal.agregarPersona(persona2);
        System.out.println(gestorDePersonal);
        gestorDePersonal.agregarAutoAPersona(persona, automovil);

        ArrayList<Automovil> automovils = persona.getAutomoviles();
        for (Automovil automovil1 : automovils) {
            System.out.println(automovil1.getModelo());
        }

    }
}
