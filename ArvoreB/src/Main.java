public class Main {
    public static void main(String[] args) throws Exception {
        
        Arvore arvoreB = new Arvore();
        
        arvoreB.inserir(10);
        arvoreB.inserir(5);
        arvoreB.inserir(15);
        arvoreB.inserir(3);
    

        System.out.println("Em ordem: ");
        arvoreB.emOrdem();
       
        System.out.println("Pós ordem: ");
        arvoreB.posOrdem();

        arvoreB.buscaValor(3);
}
}
