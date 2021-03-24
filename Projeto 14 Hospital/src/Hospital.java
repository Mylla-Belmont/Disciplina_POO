import java.util.TreeMap;

public class Hospital {
    TreeMap<String, IPaciente> pacientes;
    TreeMap<String, IMedico> medicos;

    Hospital(){
        this.pacientes = new TreeMap<>();
        this.medicos = new TreeMap<>();
    }

    public void addPaciente(IPaciente paciente){
    }

    public void addMedico(IMedico medico) {
        
    }

    public void removerPaciente(String id){
    }

    public void removerMedico(String id){
    }

    public void vincular(String nomeMedico, String nomePaciente){
    }

    public String showAll(){
        return null;
    }
}
