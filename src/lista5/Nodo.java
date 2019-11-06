/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

import java.util.ArrayList;

/**
 *
 * @author bruno.191196
 * @param <T>
 */
public class Nodo<T> {
  T valor;
  Nodo pai;
  ArrayList<Nodo> filhos;

  public Object adicionaFilho(T valor) {
    Nodo filho = new Nodo();
    filho.valor = valor;
    filho.pai = this;
    filhos.add(filho);
    return filho;
  }
  
  public boolean removeFilho(T valor) {
    for (Nodo filho: filhos) {
      if (valor.equals(filho.valor)) {
        filhos.remove(filho);
        return true;
      }
    }
    return false;
  }
  
  public Object checaFilho (Nodo pai) {
    if (pai.filhos.isEmpty() == false) {
      for (Nodo nodo: (ArrayList<Nodo>) pai.filhos) {
        if (nodo.valor == valor) {
          return nodo;
        }
      }
      for (Nodo nodo: (ArrayList<Nodo>) pai.filhos) {
        checaFilho(nodo);
        return nodo;
      }
    }
    return false;
  }
  
  @Override
  public String toString () {
    return "valor: " + valor + "; info do pai: " + pai;
  }
  
  public Nodo() {
    this.filhos = new ArrayList<>();
  }
}
