import java.util.Collection;
import java.util.TreeMap;

public class Medico implements IMedico{
    String id;
    String especialidade;
    TreeMap<String, IPaciente> pacConsulta;

    Medico(String id, String especialidade){
        this.id = id;
        this.especialidade = especialidade;
        this. pacConsulta = new TreeMap<>();
    }

    public String getId() {
        return id;
    }

    public void addPaciente(IPaciente paciente) {
        if(pacConsulta.get(paciente.getId()) != null)
            throw new RuntimeException("fail: medico já está vinculado com este paciente");
        pacConsulta.put(paciente.getId(), paciente);
        paciente.addMedico(this);
    }

    public void removerPaciente(String idPaciente) {
        if(!pacConsulta.containsKey(idPaciente))
            throw new RuntimeException("fail: paciente não encontrado");
        pacConsulta.remove(idPaciente);
        pacConsulta.get(idPaciente).removerMedico(this.id);
    }

    public Collection<IPaciente> getPacientes() {
        return pacConsulta.values();
    }
    
    public String toString(){
        return "Med: " + id + ":" + especialidade + "   " + pacConsulta.values().toString();
    }
}
