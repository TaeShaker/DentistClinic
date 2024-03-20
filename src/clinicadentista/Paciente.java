/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicadentista;

/**
 *
 * @author Aluno
 */
public class Paciente {
    private String Nome;
    private String Cpf;
    private String Sexo;

    public Paciente(String Nome, String Cpf, String Sexo) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Sexo = Sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
}
