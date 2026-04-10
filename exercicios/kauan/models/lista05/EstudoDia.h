#ifndef ESTUDODIA_H
#define ESTUDODIA_H

#include "utils/ValorString.h"

class EstudoDia {
private:
    ValorString dia;
    int minutos;

public:
    EstudoDia();
    EstudoDia(ValorString dia, int minutos);

    ValorString obterDia();
    int obterMinutos();

    void adicionarMinutos(int valor);
    bool ehMaiorQue(int outroMinutos);
};

#endif