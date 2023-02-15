package exercicios.exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public void book() {
        System.out.println("Autor: " + autor + "Titulo: " + titulo + "Numero de páginas: " + totalPaginas + "pagina atual: " + paginaAtual );
    }

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 1;
    }

    public int getPaginaAtual() {
          return paginaAtual;
        
    }

    public void setAvancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        } else {
            System.out.println("Acabou o livro.");
        }
    }

    public void setRetrocederPagina() {
        if (paginaAtual > 1) {
            paginaAtual--;
        } else {
            mostrarCapa();
        }
    }

    public void setSomarPagina(int newPage) {
        if ((newPage + paginaAtual) <= totalPaginas) {
            paginaAtual = newPage + paginaAtual;
        } else {
            System.out.println("Página não existe.");
        }
    }
    public void setIrPagina(int newPage) {
        if(newPage > 1 && newPage < totalPaginas) {
            paginaAtual = newPage;
        } else {
            if (newPage == 0) {
                paginaAtual = newPage;
                mostrarCapa();
            }
        }
        
    }
    public void mostrarCapa() {
        System.out.println("CAPA");
    }
}
