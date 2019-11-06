/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

/**
 *
 * @author bruno.191196
 * @param <T>
 */
public interface Arvore<T> {
  
  public void limpa();
  
  public Object existe(T valor);
  
  public void criaRaiz(T valor);
  
}
