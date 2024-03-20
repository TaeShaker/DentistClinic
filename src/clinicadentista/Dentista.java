/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicadentista;

/**
 *
 * @author Aluno
 */
public class Dentista {
    private int cro;
    private String Nome;
    private String Especialidade;

    public Dentista(int cro, String Nome, String Especialidade) {
        this.cro = cro;
        this.Nome = Nome;
        this.Especialidade = Especialidade;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }
}
