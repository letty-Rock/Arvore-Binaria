public class ArvoreBinaria
{
private No raiz;
  Integer count = 0;
  String nulo = "\t";

public ArvoreBinaria()
  {
    this.raiz = null;
  }
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
  String contador = new String(new char[count]).replace("\0", nulo);
  if (atual != null) {
   count++;
     System.out.println(contador + atual.getId());
    
    preFixado(atual.getLeft());
    preFixado(atual.getRight());
    count--;}
  
    if(atual == null)
    {
      System.out.println(contador+"-");
    }
  }
public void imprimeElementosArvore()
  {
  preFixado(raiz);
   
}
 
}