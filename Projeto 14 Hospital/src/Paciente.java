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
        if(medConsulta.containsValue(medico))
            throw new RuntimeException("fail: medico já vinculado");
        medConsulta.put(medico.getId(), medico);
    }

    public void removerMedico(String idMedico) {
        if(!medConsulta.containsKey(idMedico))
            throw new RuntimeException("fail: medico não vinculado");
        medConsulta.remove(idMedico);
        medConsulta.get(idMedico).removerPaciente(this.id);
    }

    public Collection<IMedico> getMedicos() {
        return medConsulta.values();
    }
    
    public String toString(){
        String listaMedicos = new String();
        for(IMedico medicos : getMedicos())
            listaMedicos += medicos.getId() + " ";
        return id + ":" + diagnostico + "  Meds: " + "[ " + listaMedicos + " ]" + "\n";
    }
}
