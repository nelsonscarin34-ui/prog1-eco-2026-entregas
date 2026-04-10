#ifndef LIVROBIBLIOTECA_H
#define LIVROBIBLIOTECA_H

#include "utils/ValorString.h"

class LivroBiblioteca {
private:
    ValorString titulo;
    ValorString autor;
    int paginas;

public:
    LivroBiblioteca();
    LivroBiblioteca(ValorString titulo, ValorString autor, int paginas);

    ValorString obterTitulo();
    ValorString obterAutor();
    int obterPaginas();

    ValorString resumir();
    bool temMaisDe300Paginas();
};

#endif