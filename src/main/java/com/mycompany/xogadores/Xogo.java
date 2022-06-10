package proxecto.proxectoxogo;

public class Xogo {
   public String gañador(String xogada1,String xogada2){
       String resultado;
       if (xogada1.equals(xogada2)){
           resultado="EMPATE!";
       }else if (xogada1.equals("PEDRA") && xogada2.equals("PAPEL")){
           resultado="Gaña o xogador 2!";
       }else if (xogada1.equals("PAPEL") && xogada2.equals("TESOIRAS")){
           resultado="Gaña o xogador 2!";
       }else if (xogada1.equals("TESOIRAS") && xogada2.equals("PEDRA")){
           resultado="Gaña o xogador 2!";
       }else{
           resultado="Gaña o xogador 1!";
       }
    return resultado;
   }
}
