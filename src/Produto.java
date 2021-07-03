import java.text.DecimalFormat;
import java.util.Objects;

public class Produto {
    private String tipo;
    private String nome;
    private Double preco;
    private String referencia;//A referencia e os 3 primeiros chars transformado em int de tipo e nome concatenados.

    public Produto(String tipo, String nome, Double preco) {
    this.tipo = tipo;
    this.nome= nome;
    this.preco = preco;

        String referencia1 = "";

        for(int i=0;i<nome.length();i++){
            int letra1 = nome.charAt(i);
            referencia1 += letra1;

        }
        this.referencia = (referencia1);
    }


    public String getTipo() {
        return tipo;
    }


    public String getNome() {
        return nome;
    }



    public String getPreco() {
        DecimalFormat df = new DecimalFormat(".00");
        return "R$" + df.format(this.preco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return tipo.equals(produto.tipo) && nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, nome);
    }
//    public String getReferencia(){
//        return this.referencia;
//    }

//    public void setReferencia(){
//        String referencia1 = "";
//        String referencia2 = "";
//        for(int i=0;i<3;i++){
//            int letra1 = nome.charAt(i);
//            int letra2 = tipo.charAt(i);
//            referencia1 += letra1;
//            referencia2 += letra2;
//        }
//        this.referencia = Integer.parseInt(referencia1 + referencia2);
//    }
    @Override
    public String toString(){
        return "Produto " + nome + ", valor: " + this.getPreco();
    }
}
