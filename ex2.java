import java.util.Scanner;
import java.util.List;

public class ex2{
    public static void main (String args []){
        Scanner in= new Scanner(System.in);
        //int n=in.nextInt();
        //System.out.println(somatorio(n));
        //System.out.println(fibonacci(n));
        //int k=in.nextInt();
        //int j=in.nextInt();
        //System.out.println(somaEntre(k,j));
        //String bin="";
        //int dec=in.nextInt();
        //Int vetor = new int[10,5,7,67]
        //Int pos = 0;
        //Int maior = 0;
        String s=in.nextLine();
        System.out.println(isPal(s));
    }

    public static int somatorio(int n){
        if(n<=0){
            return 0;
        }
        else{
            return n+somatorio(n-1);
        }
    }

    public static int fibonacci(int pos){
        if(pos<=0){
            return 0;
        }
        else if(pos==1){
            return 1;
        }
        else{
            return fibonacci(pos-1)+fibonacci(pos-2);
        }
    }

    public static int somaEntre(int k, int j){
        if(k<=0||j<0||k<j){
            return 0;
        }
        else if(k==j){
            return k;
        }
        else{
            return k+somaEntre(k-1, j);
        }
    }

    public static boolean isPal(String s){
        boolean pal=true;
        if(s.isEmpty()||s.length()-1==0){
            return pal;
        }
        else if(s.charAt(0)!=s.charAt(s.length()-1)){
            return !pal;
        }
        else if(s.charAt(0)==s.charAt(s.length()-1)){
            String aux= s.substring(1, s.length()-1);
            return isPal(aux);
        }

        return pal;
    }

    public static int somaLista(List<int> lista){
      if(lista.size()==0){
        return 0;
      }
      if(lista.size()==1){
        return lista[0]
      }
      else{
        int valor=lista[0];
        int lista2[]=lista.;
        return valor+somalista(lista2)
      }
        


public static int findBiggest(vetor []){
if(pos<vetor.size()){
if(vetor[pos]>maior){
maior = vetor[pos];
}
pos ++;
Int findBiggest(vetor);
}
else{
System.out.println(“O maior elemento e: ” + maior)
}
}

    public static int dec2bin(int dec){
     ((dec%2).toString()) + bin;
     if(dec/2>1){
      dec2bin(dec/2)
     }
     if(dec/2==1){
      “1” + bin;
      system.out.println(“O valor em binário é: “ + bin);
     }
    }
}
