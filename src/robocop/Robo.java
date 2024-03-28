
package robocop;

public class Robo {
    private String nome;
    private int bateria;
    private String data_fab;

    public Robo() {
        this.nome = "R2D2";
        this.bateria = 10;
        this.data_fab = "19-03-2024";
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getBateria() {
        return bateria;
    }

    public void setData_fab(String data_fab) {
        this.data_fab = data_fab;
    }

    public String getData_fab() {
        return data_fab;
    }
    
}
