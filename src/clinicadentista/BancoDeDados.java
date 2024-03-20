/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicadentista;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class BancoDeDados {
    
    ArrayList<Dentista> listaDentistasSelecionados = new ArrayList<Dentista>();
    
    public ArrayList<Dentista> getDentistasByEspecialidade(String Especialidade){
        for (Dentista dentista : listaDentista){
            if(Especialidade.equals(dentista.getEspecialidade()) ||
                    Especialidade.equals("Todas"))
            {
                //achei um dentista da especialidade procurada
                //find a specialized dentist search
                
                listaDentistasSelecionados.add(dentista);
            }
        }
        return listaDentistasSelecionados;
    }
    
    private static ArrayList<Dentista> listaDentista = new ArrayList<Dentista>();

    public static ArrayList<Dentista> getListaDentista() {
        return listaDentista;
    }

    public static ArrayList<Paciente> getListaPaciente() {
        return listaPaciente;
    }
    
    
    
    public void addDentista(Dentista dentista)
    {
        listaDentista.add(dentista);
    }
    
    private static ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
    public void addPaciente(Paciente paciente)
    {
        listaPaciente.add(paciente);
    }
    
    
    
}
