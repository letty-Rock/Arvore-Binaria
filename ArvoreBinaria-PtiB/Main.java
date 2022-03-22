class Main {
  public static void main (String[] args) {
    ArvoreBinaria a = new ArvoreBinaria(); 
       a.insere(22,"A");
      a.insere(15,"B"); 
      a.insere(50,"C"); 
      a.insere(45,"D");
      a.insere(30,"E");
      a.insere(3,"F");
    a.insere(2,"G");
    a.insere(10,"H");
    a.insere(20,"I");
    a.insere(98,"J");
    a.insere(8,"K");
    a.insere(9,"L");
    
    a.imprimeElementosArvore();
    System.out.println("Há "+a.numEsq()+" nós á esquerda");
  }

  
}