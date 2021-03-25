import java.util.Collection;
import java.util.TreeMap;

public class Medico implements IMedico{
    String id;
    String especialidade;
    TreeMap<String, Paciente> pacConsulta;

    Medico(String id, String especialidade){
        this.id = id;
        this.especialidade = especialidade;
        this. pacConsulta = new TreeMap<>();
    }

    public String getId() {
        return id;
    }

    public void addPaciente(IPaciente paciente) {
        
    }

    public void removerPaciente(String idPaciente) {
        
    }

    public Collection<IPaciente> getPacientes() {
        return null;
    }
    
}
