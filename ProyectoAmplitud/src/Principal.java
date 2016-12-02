/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] graf = {{0, 1, 1, 0, 0, 0},
        {0, 0, 0, 1, 1, 0},
        {0, 0, 0, 0, 1, 1},
        {0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0}};

        java.util.ArrayList heuristica = new java.util.ArrayList();
        heuristica.add(0, java.lang.Integer.valueOf(150));
        heuristica.add(1, java.lang.Integer.valueOf(80));
        heuristica.add(2, java.lang.Integer.valueOf(120));
        heuristica.add(3, java.lang.Integer.valueOf(100));
        heuristica.add(4, java.lang.Integer.valueOf(90));
        heuristica.add(5, java.lang.Integer.valueOf(0));

        int op;
        do {
            java.util.Scanner dato = new java.util.Scanner(System.in);
            System.out.println("Digite opcion");
            op = dato.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Busqueda en profundidad");
                    BusquedaProfundidad bp = new BusquedaProfundidad();
                    System.out.println(bp.buscar(graf, 0, 5));
                    bp.imprimirCaminos();
                    break;

                case 2:
                    System.out.println("Busqueda en Amplitud");
                    BusquedaAmplitud ba = new BusquedaAmplitud();
                    System.out.println(ba.buscar(graf, 0, 5));
                    ba.imprimircaminos();
                    break;

                case 3:
                    System.out.println("Busqueda en Primero el mejor");
                    BusquedaPrimeroMejor bpm = new BusquedaPrimeroMejor();
                    System.out.println(bpm.buscar(graf, 0, 5, heuristica));
                    break;

            }

        } while (op <= 3);

    }
}
