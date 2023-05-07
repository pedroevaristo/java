package myClass;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    public String calcIMC;
    
    
    //1.79 81kg
    
    public float calcIMC() {
        
        return (this.peso / (this.altura * this.altura));
        //return = Math.pow(2, 1.79);
    }
    
    public String resIMC() {
        
        if(calcIMC() <= 18.5){
          return "MAGRELO";
        }else {
            if(calcIMC() <= 24.9){
                return "Normal";
            }
        } if
          (calcIMC() <= 29.9){
                return "Obeso";
                
          }
        //return = Math.pow(2, 1.79);
        return null;
    }
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
