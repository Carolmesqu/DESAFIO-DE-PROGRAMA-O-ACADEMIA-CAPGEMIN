import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nPares = 0;
    System.out.print("Digite um texto:");
    String p = sc.nextLine();
   
    HashMap<String, Integer> map= new HashMap<>();		  
		for(int i = 0; i < p.length(); i++){
		  for(int j = i; j < p.length(); j++){
        char[] letra = p.substring(i, j+1).toCharArray();
        Arrays.sort(letra);
		    String valor = new String(letra);
		    if (map.containsKey(valor)){
          map.put(valor, map.get(valor)+1);
        }else{
          map.put(valor, 1);
          }
		    }
		}
		for(String key: map.keySet()){
		  int n = map.get(key);
		  nPares += (n * (n-1))/2;
		}
    System.out.print(nPares);
    sc.close();
  }
}