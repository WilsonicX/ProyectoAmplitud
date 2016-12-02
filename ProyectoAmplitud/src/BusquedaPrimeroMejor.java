/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class BusquedaPrimeroMejor {

    java.util.ArrayList visitados;
    java.util.ArrayList adyacentes;
    java.util.ArrayList pilanodos;

    public BusquedaPrimeroMejor() {
        this.visitados = new java.util.ArrayList();
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

    public String buscar(int[][] grafo, int ni, int nf, java.util.ArrayList heuristica) {
        String x = "no encontrado";

        this.pilanodos.add(java.lang.Integer.valueOf(ni));

        while (this.pilanodos.size() != 0) {

            int i = java.lang.Integer.parseInt(this.pilanodos.remove(0).toString());
            System.out.println("Adyacentes del nodo:" + i);
            this.visitados.add(java.lang.Integer.valueOf(i));
            if (i == nf) {
                x = "encontrado";

                break;

            } else {

                int j;
                this.adyacentes = new java.util.ArrayList();
                for (j = grafo.length - 1; j >= 0; j--) {

                    if (grafo[i][j] == 1) {
                        System.out.println("," + j);
                        this.adyacentes.add(java.lang.Integer.valueOf(j));

                    }

                }

                if (this.adyacentes.isEmpty() == true) {
                    System.out.println("no tiene adyacentes: " + j);

                } else {
                    this.pilanodos.add(java.lang.Integer.valueOf(this.seleccionarMenor(heuristica)));
                }
                this.adyacentes = null;

            }
        }

        return x;

    }

    public int seleccionarMenor(java.util.ArrayList heuristica) {

        int ad = java.lang.Integer.parseInt(this.adyacentes.get(0).toString());
        int posmenor = ad;
        int menor = java.lang.Integer.parseInt(heuristica.get(ad).toString());

        for (int i = 1; i < this.adyacentes.size(); i++) {

            int ad1 = java.lang.Integer.parseInt(this.adyacentes.get(i).toString());
            int menor1 = java.lang.Integer.parseInt(heuristica.get(ad1).toString());

            if (menor1 < menor) {
                menor = menor1;
                posmenor = ad1;

            }
        }

        System.out.println(posmenor + ", " + menor);
        //System.out.println("entro");

        return posmenor;
    }

    public void imprimirCaminos() {
        System.out.println("---------");

        for (int k = 0; k < this.visitados.size(); k++) {
            System.out.println(java.lang.Integer.parseInt(this.visitados.get(k).toString()));

        }

    }

}
