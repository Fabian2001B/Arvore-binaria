public class Arvore {
    No raiz = null;

    public void inserir(int valor) {

        raiz = inserirRecursivo(raiz, valor);
        // chama recursivo e pede raiz e o valor do no
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor); // adiciona o novo nó
        }
        // desce comparando ate achar a posiçao certa
        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }

        return atual;
    }

    public void emOrdem() {
        emOrdemRecursivo(raiz);
        System.out.println();
    }

    private void emOrdemRecursivo(No atual) {
        if (atual != null) {
            emOrdemRecursivo(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdemRecursivo(atual.direita);
        }
    }

    public void posOrdem() {
        posOrdemRecursivo(raiz);
          System.out.println();
    }

    public void posOrdemRecursivo(No atual) {
        emOrdemRecursivo(atual.esquerda);
        emOrdemRecursivo(atual.direita);
        System.out.print(atual.valor + " ");

    }

    public void buscaValor(int valor) {
        buscaValorRecursivo(raiz, valor);
    }

public boolean buscaValorRecursivo (No atual, int valor){
    if( atual == null){
        System.out.println("Valor " + valor +"  não encontrado");
        return false;
    
    }
    if(valor == atual.valor){
          System.out.println("Valor " + valor + " encontrado");
        return true;
       
    }
    if (valor < atual.valor) {
        return buscaValorRecursivo(atual.esquerda, valor);
    } else {
        return buscaValorRecursivo(atual.direita, valor);
    }
}
}

