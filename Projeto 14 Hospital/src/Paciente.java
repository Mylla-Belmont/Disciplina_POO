import java.util.Collection;
import java.util.TreeMap;

public class Paciente implements IPaciente{
    String id;
    String diagnostico;
    TreeMap<String, IMedico> medConsulta;

    Paciente(String id, String diagnostico){
        this.id = id;
        this.diagnostico = diagnostico;
        this.medConsulta = new TreeMap<>();
    }

    public String getId() {
        return id;
    }

    public void addMedico(IMedico medico) {
        if(medConsulta.get(medico.getId()) == null)
            throw new RuntimeException("fail: medico não encontrado");
        medConsulta.put(medico.getId(), medico);
		medico.addPaciente(this);
    }

    public void removerMedico(String idMedico) {
        if(!medConsulta.containsKey(idMedico))
            throw new RuntimeException("fail: medico não encontrado");
        medConsulta.remove(idMedico);
        medConsulta.get(idMedico).removerPaciente(this.id);
    }

    public Collection<IMedico> getMedicos() {
        return medConsulta.values();
    }
    
    public String toString(){
        return id + ":" + diagnostico + "  Meds: " + medConsulta.values().toString() + "\n";
    }
}
