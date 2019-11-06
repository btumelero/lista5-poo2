/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

/**
 *
 * @author bruno.191196
 */
public class MinhaArvore implements Arvore {
  Nodo raiz;
  
  @Override
  public void limpa() {
    raiz.filhos.clear();
  }

  @Override
  public Object existe(Object valor) {
    if (raiz.valor == valor) {
      return raiz;
    } else {
      return raiz.checaFilho(raiz);
    }
  }

  @Override
  public void criaRaiz(Object valor) {
    raiz = new Nodo();
    raiz.valor = valor;
    raiz.pai = null;
  }
  
  public void toString (Nodo pai) {
    if (pai.filhos.isEmpty() == false) {
      pai.filhos.forEach((nodo) -> {
        System.out.println(nodo);
      });
      pai.filhos.forEach((nodo) -> {
        toString((Nodo) nodo);
      });
    }
  }
}
