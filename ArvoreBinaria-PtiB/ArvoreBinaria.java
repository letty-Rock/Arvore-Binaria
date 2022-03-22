public class ArvoreBinaria
{
private No raiz;
  Integer esq = 0;
  
  public void insere(long id, Object elemento)
{
No novoNo = new No(id,elemento,null,null);
if (raiz == null) {
raiz = novoNo;
  } else {
No atual = raiz;
No pai;
while (true) {
pai = atual;
if (id < atual.getId()) { // vai inserir à esquerda
atual = atual.getLeft();
if (atual == null) { // pode inserir à esquerda
pai.setLeft(novoNo);
return;
} // se não é nulo, vai tentar o próximo filho
} else { // vai inserir à direita
atual = atual.getRight();
if (atual == null) { // pode inserir à direita
pai.setRight(novoNo);
return;
  }
  }  
  }
  }
  }

private void preFixado(No atual)
  {
if (atual != null){
 System.out.println("Id: "+atual.getId()+" Elemento:"+atual.getElemento());
  preFixado(atual.getRight());
  preFixado(atual.getLeft());
  if(atual.getLeft() != null)
  {
    esq++;
  }
  }
}
 private long calculaEsq(No atual, long a)
  {
    if (atual != null){
      long e;
      e = calculaEsq(atual.getRight(),a)+1;
       return a+e;
    } 
    return a;
    }
public void imprimeElementosArvore()
  {
  preFixado(raiz);
    
   
}
  public long numEsq(){
    long a = 0;
    return calculaEsq(raiz,a);
  }
 
}