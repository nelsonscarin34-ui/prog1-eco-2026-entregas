#include "EstudoDia.h"


EstudoDia::EstudoDia() {
    this->dia = ValorString("");
    this->minutos = 0;
}

EstudoDia::EstudoDia(ValorString dia, int minutos) {
    this->dia = dia;
    this->minutos = minutos;
}

ValorString EstudoDia::obterDia() {
    return dia;
}

int EstudoDia::obterMinutos() {
    return minutos;
}

void EstudoDia::adicionarMinutos(int valor) {
    minutos += valor;
}

bool EstudoDia::ehMaiorQue(int outroMinutos) {
    return minutos > outroMinutos;
}