import java.util.TreeMap;

public class Hospital {
    TreeMap<String, IPaciente> pacientes;
    TreeMap<String, IMedico> medicos;

    Hospital(){
        this.pacientes = new TreeMap<>();
        this.medicos = new TreeMap<>();
    }

    void removerPaciente(String id){
    }

    void removerMedico(String id){
    }

    void addPaciente(IPaciente paciente){
    }

    void addPaciente(IMedico medico){
    }

    void vincular(String nomeMedico, String nomePaciente){
    }

    String showAll(){
        return null;
    }
}
