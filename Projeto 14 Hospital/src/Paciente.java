import java.util.Collection;
import java.util.TreeMap;

public class Paciente implements IPaciente{
    String id;
    String diagnostico;
    TreeMap<String, Medico> medConsulta;

    Paciente(String id, String diagnostico){
        this.id = id;
        this.diagnostico = diagnostico;
        this.medConsulta = new TreeMap<>();
    }

    public String getId() {
        return null;
    }

    public void addMedico(IMedico medico) {
        
    }

    public void removerMedico(String idMedico) {
        
    }

    public Collection<IMedico> getMedicos() {
        return null;
    }
    
}
