import java.util.TreeMap;

public class Hospital {
    TreeMap<String, IPaciente> pacientes;
    TreeMap<String, IMedico> medicos;

    Hospital(){
        this.pacientes = new TreeMap<>();
        this.medicos = new TreeMap<>();
    }

    public void addPaciente(IPaciente paciente){
        if(pacientes.containsKey(paciente.getId()))
            throw new RuntimeException("fail: paciente já cadastrado");
        pacientes.put(paciente.getId(), paciente);
    }

    public void addMedico(IMedico medico) {
        if(medicos.containsKey(medico.getId()))
            throw new RuntimeException("fail: medico já cadastrado");
        medicos.put(medico.getId(), medico);
    }

    public void removerPaciente(String id){
        if(!pacientes.containsKey(id))
            throw new RuntimeException("fail: paciente não encontrado");
        for(IMedico medico : pacientes.get(id).getMedicos())
            medico.removerPaciente(id);
        pacientes.remove(id);
    }

    public void removerMedico(String id){
        if(!medicos.containsKey(id))
            throw new RuntimeException("fail: medico não encontrado");
        for(IPaciente paciente : medicos.get(id).getPacientes())
            paciente.removerMedico(id);
        medicos.remove(id);
    }

    public void vincular(String nomeMedico, String nomePaciente){
        if(!pacientes.containsKey(nomePaciente))
            throw new RuntimeException("fail: paciente não encontrado");
        if(!medicos.containsKey(nomeMedico))
            throw new RuntimeException("fail: medico não encontrado");
        IPaciente paciente = pacientes.get(nomePaciente);
        IMedico medico = medicos.get(nomeMedico);
        if(paciente.getMedicos().contains(medico))
            throw new RuntimeException("fail: medico já vinculado");
        if(medico.getPacientes().contains(paciente))
            throw new RuntimeException("fail: paciente já vinculado");
        medico.addPaciente(paciente);
        paciente.addMedico(medico);
    }

    public String showAll(){
        StringBuilder out = new StringBuilder();
        for(IPaciente paciente : pacientes.values())
            out.append("Pac:  " + paciente);
        for(IMedico medico : medicos.values())
            out.append("Med:  " + medico);
        return out.toString();
    }
}