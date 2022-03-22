public class No
{
private long id; // identificador do elemento
private Object elemento; // armazena o elemento de cada No
private No left; // aponta para o filho esquerdo do nó
private No right; // aponta para o filho direito do nó
public No(long id, Object elemento, No left, No right) 

{
this.id = id;
this.elemento = elemento;
this.left= left;
this.right = right;

}
public void setId(long id) // método para alterar o identificador do nó
{
this.id = id;
}
public long getId() // método para receber o identificador do nó
{
return this.id;
}
public void setElemento(Object elemento) // método para alterar o elemento
{
this.elemento = elemento;
}
public Object getElemento() // método para receber o objeto contido no No
{
return elemento;
}
public void setLeft(No left) // método que altera o filho esquerdo
{
 this.left = left;
}
public No getLeft() // método que recebe o filho esquerdo do nó
{
return left;
}
public void setRight(No right) // método que altera o filho direito
{
this.right = right;
}
public No getRight() // método que recebe o filho direito do nó
{
return right;
}

}

// Final da classe No