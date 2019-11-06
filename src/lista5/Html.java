/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author bruno.191196
 */
public class Html {
  LinkedList lista;
  
  public void leHtml (String nome, MinhaArvore tree) {
    String arquivo = nome;
    String linha;
    try {
      FileReader fReader = new FileReader(arquivo);
      BufferedReader bReader = new BufferedReader(fReader);
      linha = bReader.readLine();
      tree.criaRaiz(linha.substring(1, linha.length()-1));
      while((linha = bReader.readLine()) != null) {
        while (linha.contains("<")) {
          lista.offer(linha.substring(linha.indexOf("<"), linha.indexOf(">")));
          linha = linha.substring(linha.indexOf(">") + 1);
        }
      }
      criaNodos(lista, tree.raiz);
      bReader.close();
    }
    // Arquivo não encontrado
    catch(FileNotFoundException ex) {
      System.out.println("Não foi possível abrir o aquivo '" + arquivo + "'");                
    }
    // Arquivo existe, mas leitura não foi possível
    catch(IOException ex) {
      System.out.println("Erro ao ler '" + arquivo + "'");
    }
  }
  
  public void criaNodos (LinkedList lista, Nodo pai) {
    while (lista.isEmpty() == false) {
      if (lista.peek().toString().startsWith("</")) {
        lista.poll();
        break;
      } else {
        if (lista.peek().toString().startsWith("<")) {
          String linha = lista.poll().toString();
          pai.adicionaFilho(linha.substring(1));
          criaNodos(lista, (Nodo) pai.filhos.get(pai.filhos.size()-1));
        }
      }
    }
  }
  
  public Html() {
    this.lista = new LinkedList();
  }
}
