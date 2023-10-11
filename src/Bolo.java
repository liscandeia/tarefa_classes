public class Bolo {
    private String sabor;
    private boolean vegano;
    private int kg;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
    //preço baseado no kg
    public void preco (){
     int valor = getKg();
     int total = valor * 100;
        System.out.println("Seu bolo custa "+ total +  " reais");
    }
    /* descrição do pedido*/

    public void descricao(){
        if (vegano) {
            System.out.println("Seu bolo é de " + getSabor() + " é vegano");
        } else {
            System.out.println("Seu bolo é de "+ getSabor() +  " e não é vegano");

        }
    }


}
