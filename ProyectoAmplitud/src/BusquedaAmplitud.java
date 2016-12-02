/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class BusquedaAmplitud {

    java.util.ArrayList visitados;
    java.util.ArrayList caminos;
    java.util.ArrayList colanodos;

    public BusquedaAmplitud() {
        this.visitados = new java.util.ArrayList();
        this.caminos = new java.util.ArrayList();
        this.colanodos = new java.util.ArrayList();

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

        this.visitados.add(java.lang.Integer.valueOf(ni));
        this.caminos.add(java.lang.Integer.valueOf(ni));
        this.colanodos.add(java.lang.Integer.valueOf(ni));

        while (this.colanodos.size() != 0) {

            int i = java.lang.Integer.parseInt(this.colanodos.remove(0).toString());

            if (i == nf) {
                x = "encontrado";
                System.out.println("encontrado");
            } else {

                for (int j = 0; j < grafo.length; j++) {

                    if (grafo[i][j] == 1 && this.verificarVisitado(j) == false) {
                        this.colanodos.add(java.lang.Integer.valueOf(j));
                        this.visitados.add(java.lang.Integer.valueOf(j));
                        this.caminos.add(java.lang.Integer.valueOf(j));

                    }
                }
            }

        }

        return x;

    }

    public void imprimircaminos() {

        for (int k = 0; k < this.caminos.size(); k++) {
            System.out.println(java.lang.Integer.parseInt(this.caminos.get(k).toString()));

        }

    }

}
