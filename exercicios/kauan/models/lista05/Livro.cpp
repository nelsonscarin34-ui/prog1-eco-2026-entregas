#include "LivroBiblioteca.h"
LivroBiblioteca::LivroBiblioteca() {
    this->titulo = ValorString("");
    this->autor = ValorString("");
    this->paginas = 0;
}

LivroBiblioteca::LivroBiblioteca(ValorString titulo, ValorString autor, int paginas) {
    this->titulo = titulo;
    this->autor = autor;
    this->paginas = paginas;
}

ValorString LivroBiblioteca::obterTitulo() {
    return titulo;
}

ValorString LivroBiblioteca::obterAutor() {
    return autor;
}

int LivroBiblioteca::obterPaginas() {
    return paginas;
}

ValorString LivroBiblioteca::resumir() {
    return ValorString(
        titulo.str() +
        " | Autor: " +
        autor.str() +
        " | Páginas: " +
        ValorString::intParaString(paginas).str()
    );
}

bool LivroBiblioteca::temMaisDe300Paginas() {
    return paginas > 300;
}