import java.util.Scanner;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static boolean d(String s){
    String dStr = "0123456789";
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j<dStr.length(); j++){
        if((s.charAt(i)) == (dStr.charAt(j))){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean mi(String s){
    String aStr = "abcdefghijklmnopqrstuvwxyz";
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j<aStr.length(); j++){
        if((s.charAt(i)) == (aStr.charAt(j))){
          return true;
        }
      }
    }
    return false;
  }  

  public static boolean ma(String s){
    String aStrM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";   
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j < aStrM.length(); j++){
        if((s.charAt(i)) == (aStrM.charAt(j))){
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean ce(String s){
    String eStr = "!@#$%^&*()-+";
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j < eStr.length(); j++){
        if((s.charAt(i)) == (eStr.charAt(j))){
          return true;
        }
      }
    }
    return false;
  }
  

  public static void main(String[] args) {
    System.out.print("Senha = ");
    String s = sc.nextLine();    

    int falta = 0;
    boolean d = d(s), mi = mi(s), ma = ma(s), ce = ce(s);

    if((s.length()) < 6){
      falta = 6 - (s.length());
    }else{ 
      if(!d){
        falta = falta + 1;
      }
      if(!mi){
        falta = falta + 1;
      }
      if(!ma){
        falta = falta + 1;
      }
      if(!ce){
        falta = falta + 1;
      }
    }
    System.out.println(falta); 
    
  }

}