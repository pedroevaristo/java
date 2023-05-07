package aula02;

import myClass.Pessoa;

public class Aula02 {
    
  public static void main(String[] args){
      Pessoa marilia = new Pessoa();
      marilia.setNome("Marilia Santos");
       marilia.setIdade(25);
        marilia.setAltura((float) 1.54);
         marilia.setPeso(70);
      
    System.out.println("A pessoa" + marilia.getNome());
    System.out.println("Tem"+ marilia.getIdade()+ "anos com altura de"+marilia.getAltura()+"cm e o peso de" + + marilia.getPeso());
    System.out.println("Resultado o seguinte IMC"+ marilia.calcIMC);
          
  }
}
