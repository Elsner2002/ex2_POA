import java.util.Scanner;

public class ex2{
    public static void main (String args []){
        Scanner in= new Scanner(System.in);
        //int n=in.nextInt();
        //System.out.println(somatorio(n));
        //System.out.println(fibonacci(n));
        //int k=in.nextInt();
        //int j=in.nextInt();
        //System.out.println(somaEntre(k,j));

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

    //public static int somaLista(int[] lista){
    //    
    //}
}