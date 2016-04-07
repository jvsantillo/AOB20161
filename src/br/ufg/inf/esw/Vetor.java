/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.ordenação.e.busca.pkg2016.pkg1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jv_sa
 */
public class Vetor {

    private ArrayList<Integer> Vetor;

    public Vetor(int tamanho) {

        this.Vetor = new ArrayList(tamanho);

        Random aleatorio = new Random();

        for (int i = 0; i < tamanho; i++) {

            int numSorteado = aleatorio.nextInt(1000);

            Vetor.add(i, numSorteado);

            for (int k = 0; k < i; k++) {

                if (Vetor.get(k) == numSorteado) {
                    
                    Vetor.remove(k);
                    int numRepetido = aleatorio.nextInt(1000);
                    Vetor.add(k, numRepetido);
                }
            }
        }

    }

    public void adicionarElemento(Integer elemento) {
        Vetor.add(elemento);
    }

    public void adicionarNoComeço(Integer elemento) {
        Vetor.add(0, elemento);
    }

    public void adicionarPosição(Integer elemento, int posicao) {
        try {
            Vetor.add(posicao, elemento);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("A posição " + posicao + " não existe");
        }

    }

    public void removerElemento() {
        try {
            int tamanho = Vetor.size();
            Vetor.remove(tamanho - 1);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Não há elementos para serem removidos");
        }

    }

    public void removerElementoDoComeço() {
        try {
            Vetor.remove(0);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Não há elementos para serem removidos");
        }
    }

    public void removerPosicao(int posicao) {
        try {
            Vetor.remove(posicao);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("A posição selecionada não existe");
        }

    }

    public int tamanho() {
        return Vetor.size();
    }

    public Object getElemento(int posicao) {
        try {
            return Vetor.get(posicao);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("A posição selecionada não está ocupada");
        }

        return -1;
    }

    /* public void preencherAleatoriamente(){
    
     Random aleatorio = new Random();
        
     for (int i = 0; i < Vetor.size(); i++) {
          
     Vetor.add(i, aleatorio.nextInt(65) );
            
            
     }
        
     } */
    public Integer pesquisaSeq(Integer chave) {

        for (int i = 0; i < Vetor.size(); i++) {
            if (chave == Vetor.get(i)) {

                return Vetor.indexOf(chave);

            }

        }

        return -1;
    }

    public String retornaVetor() {

        StringBuilder builder = new StringBuilder();

        int tamanho = Vetor.size();

        builder.append('[');

        for (int i = 0; i < tamanho - 1; i++) {

            builder.append(Vetor.get(i));
            builder.append(',');

        }

        Object ultimoElemento = Vetor.get(tamanho - 1);

        builder.append(ultimoElemento);
        builder.append(']');

        return builder.toString();
    }

}
