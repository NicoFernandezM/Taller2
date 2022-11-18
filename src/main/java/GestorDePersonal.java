import java.util.ArrayList;

public class GestorDePersonal {
    private ArrayList<Persona> personas;

    public GestorDePersonal(){
        this.personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return this.personas;
    }

    public void agregarPersona(Persona persona) {
        if(!personaExiste(persona)) {
            this.personas.add(persona);
            System.out.println("Persona agregada correctamente.");
            return;
        }

        System.out.println("La persona ya está en la lista.");
    }

    public boolean personaExiste(Persona persona) {
        for (Persona p : this.personas) {
            if(persona.getRut().equals(p.getRut())) {
                return true;
            }
        }

        return false;
    }

    public void agregarAutoAPersona(Persona persona, Automovil automovil) {
        persona.getAutomoviles().add(automovil);
    }

    public void agregarCorreoAPersona(Persona persona, CorreoElectronico correoElectronico) {
        persona.getCorreoElectronicos().add(correoElectronico);
    }

    public ArrayList<Persona> obtenerPersonasMismaMarcaAutomovil(String marca) {
        ArrayList<Persona> personasMismaMarcaAutomovil = new ArrayList<>();

        for (Persona persona : this.personas) {
            if(listaTieneMarca(persona.getAutomoviles(), marca)) {
                personasMismaMarcaAutomovil.add(persona);
            }
        }

        return personasMismaMarcaAutomovil;
    }

    private boolean listaTieneMarca(ArrayList<Automovil> automoviles, String marca) {
        for (Automovil automovil : automoviles) {
            if(automovil.getMarca().equalsIgnoreCase(marca)) {
                return true;
            }
        }

        return false;
    }

    public ArrayList<Persona> obtenerPersonasMismoNombre(String nombre) {
        ArrayList<Persona> personasMismoNombre = new ArrayList<>();

        for (Persona persona : this.personas) {
            if(persona.getNombre().equalsIgnoreCase(nombre)) {
                personasMismoNombre.add(persona);
            }
        }

        return personasMismoNombre;
    }

    public Persona obtenerPersonaPorRut(String rut) {
        for (Persona persona : this.personas) {
            if(persona.getRut().equals(rut)) {
                return persona;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String personas = "";

        for (Persona p: this.personas) {
            personas += p;
        }

        return personas;
    }
}

//13 font vivid italic.