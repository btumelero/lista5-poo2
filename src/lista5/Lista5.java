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
public class Lista5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    MinhaArvore tree = new MinhaArvore();
    tree.criaRaiz("avô");
    tree.raiz.adicionaFilho("pai");
    ((Nodo) tree.raiz.filhos.get(0)).adicionaFilho("filho");
    System.out.println(tree.existe("pai"));
    ((Nodo) tree.raiz).removeFilho("pai");
    tree.toString(tree.raiz);
    System.out.println(tree.existe("pai"));
    tree.limpa();
    System.out.println(tree.raiz.filhos.isEmpty());
    
    
    /*
    Html html = new Html();
    MinhaArvore tree = new MinhaArvore();
    html.leHtml("pagina.html", tree);
    System.out.println(tree.raiz);
    tree.toString(tree.raiz); //método recursivo pra imprimir toda a árvore menos a raiz
    */

  }
  
}
