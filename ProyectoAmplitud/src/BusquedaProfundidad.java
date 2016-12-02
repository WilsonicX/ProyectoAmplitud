/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class BusquedaProfundidad {

    java.util.ArrayList visitados;

    java.util.ArrayList pilanodos;
    java.util.ArrayList caminos;

    public BusquedaProfundidad() {
        this.visitados = new java.util.ArrayList();
        this.caminos = new java.util.ArrayList();
        this.pilanodos = new java.util.ArrayList();

    }

    public boolean verificarVisitado(int x) {
        boolean b = false;

        for (int k = 0; k < this.visitados.size(); k++) {

            if (java.lang.Integer.parseInt(String.valueOf(this.visitados.get(k))) == x) {
                b = true;
                break;
            }
        }

        return b;
    }

    public String buscar(int[][] grafo, int ni, int nf) {
        String x = "no encontrado";

        this.pilanodos.add(java.lang.Integer.valueOf(ni));

        while (this.pilanodos.size() != 0) {

            int i = java.lang.Integer.parseInt(this.pilanodos.remove(0).toString());
            this.visitados.add(java.lang.Integer.valueOf(i));
            if (i == nf) {
                x = "encontrado";

                break;

            } else {

                for (int j = grafo.length - 1; j >= 0; j--) {
                    if (grafo[i][j] == 1 && this.verificarVisitado(j) == false) {
                        this.pilanodos.add(0, java.lang.Integer.valueOf(j));
                    }
                }
            }
        }

        return x;

    }

    public void imprimirCaminos() {
        System.out.println("---------");

        for (int k = 0; k < this.visitados.size(); k++) {
            System.out.println(java.lang.Integer.parseInt(this.visitados.get(k).toString()));

        }

    }

}
