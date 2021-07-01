import java.text.DecimalFormat;
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
        String referencia2 = "";
        for(int i=0;i<3;i++){
            int letra1 = nome.charAt(i);
            int letra2 = tipo.charAt(i);
            referencia1 += letra1;
            referencia2 += letra2;
        }
        this.referencia = (referencia1 + referencia2);
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



    public String getReferencia(){
        return this.referencia;
    }

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
