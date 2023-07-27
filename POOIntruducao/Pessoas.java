package POOIntruducao;

public abstract class Pessoas {
    // atributos
    protected String nome;
    protected String endereco;

    //métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public abstract String getRg();
    public abstract void setRg(String rg) {
        this.rg = rg;
    }
}