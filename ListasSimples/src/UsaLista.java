public class UsaLista{

    public static void main(String[] args){
        ListaSimple lista = new ListaSimple();

        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("O");
        lista.insertaAlFinal("Y");
        lista.insertaEntreNodos("R", "A");
        lista.imprimir();
        //System.out.print(lista);
        System.out.println(lista.buscarNodo("H"));
        lista.insertarDespuesDeNodo("Y", "L");
        lista.imprimir();
        lista.intercambiarNodos("H", "L");
        lista.imprimir();

    }


}