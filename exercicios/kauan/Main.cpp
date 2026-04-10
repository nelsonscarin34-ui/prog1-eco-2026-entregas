#include "vector"
#include "iostream"
#include "utils/Printer.h"
#include "utils/Reader.h"
#include "utils/Utils.h"
#include "utils/ValorString.h"

//Lista 01
#include "models/lista01/Carro.h"
#include "models/lista01/Carro2.h"
#include "models/lista01/Estudante.h"
#include "models/lista01/Livro.h"
#include "models/lista01/Musica.h"

//Lista 02
#include "models/lista02/Cofrinho.h"
#include "models/lista02/Estudo.h"
#include "models/lista02/Sala.h"
#include "models/lista02/Camiseta.h"

//lista 03
#include "models/lista03/ListaTarefas.h"
#include "models/lista03/EstudanteAcademia.h"
#include "models/lista03/IngressoCinema.h"

//lista 04
#include "models/lista04/EstudanteMedia.h"
#include "models/lista04/Jogador.h"

//lista 05
#include "models/lista05/Turma.h"
#include "models/lista05/ItemPedido.h"
#include "models/lista05/EstudoDia.h"
#include "models/lista05/LivroBiblioteca.h"

class Main{
    public: static void execute(){
        //1° Lista de exercícios 
        //execute01(); 
        //execute02();
        //execute03();
        //execute04();
        //execute05();

        //execute06();
        //execute07();
        //execute08();
        //execute09();
        //execute10();
        //execute11();
        //execute12();
        //execute13();
        //execute14();

        //execute15();
        //execute16();
        //execute17();
        execute18();
    }; 


    private: 
        //1° Lista de atividades
        static void execute01(){
            Carro carro = Carro("Civic", 2014, 70);
            carro.usarNitro();
        };

        static void execute02(){
            Printer::printMessageIn("Informe o nome: ");
            ValorString nome = Reader::readLine();

            Printer::printMessageIn("Informe o ano: ");
            int ano = Reader::readInt();

            Printer::printMessageIn("Informe o nitro: ");
            int nitro = Reader::readInt();

            Printer::printMessageIn("Ligado (1): ");
            int ligadoInt = Reader::readInt();

            bool ligado = true ? ligadoInt == 1 : false;

            
            Carro2 carro = Carro2(nome, ano, nitro, ligado);
            carro.ligar();
            carro.usarNitro();
            Utils::repitirCarro(carro);        
        };

        static void execute03(){
            Printer::printMessageInformation("Criando objeto aluno");

            Printer::printMessageIn("Informe a matrícula do estudante: ");            
            ValorString matricula = Reader::readLine();
            Printer::printMessageOut("Matrícula: " + matricula.str());


            Printer::printMessageIn("Informe o nome do estudante: ");
            ValorString nome = Reader::readLine();
            Printer::printMessageOut("Nome: "+ nome.str());

            Estudante estudante = Estudante(nome, matricula);
            
        }

        static void execute04(){
            ValorString titulo = ValorString("Se não eu, quem vai fazer você feliz?");
            ValorString autor = ValorString("Graziela Gonçalves");
            Livro livro = Livro(titulo, autor, 100);
            Printer::printMessageInformation(livro.obterResumo().str());
            livro.alterarNumeroPaginas(200);
            Printer::printMessageAlert("Número de páginas alterado!!!");
            Printer::printMessageInformation(livro.obterResumo().str());
        };

        static void execute05(){
            Musica musica01 = Musica(ValorString("Sina de ofélia"), ValorString("Taylor Swift"), 180);

            Musica musica02 = Musica(ValorString("Greedy"), ValorString("Tate McRae"), 160);

            Printer::printMessageInformation("A 1° música escolhida foi " + musica01.titulo.str() + " com duração de " + ValorString::intParaString(musica01.duracaoEmSegundos).str() + " segundoas " + " composta por " + musica01.artista.str());
            Printer::printMessageInformation("A 2° música escolhida foi " + musica02.titulo.str() + " com duração de " + ValorString::intParaString(musica02.duracaoEmSegundos).str() + " segundoas " + " composta por " + musica02.artista.str());
        }

        //2° Lista de atividades
        static void execute06(){
            Printer::printMessageIn("Insira o nome do dono do cofrinho: ");
            ValorString nome = Reader::readLine();
            Printer::printMessageIn("Lido " + nome.str() + " \n");
            
            Printer::printMessageIn("Insira o valor para guardar: R$");
            double valor = Reader::readDouble();
            Printer::printMessageLog("Lido " + ValorString::doubleParaString(valor).str());

            Cofrinho cofrinho = Cofrinho(nome, valor);
            Printer::printMessageInformation("O cofrinho de " + cofrinho.obterNomeDono().str() + " agora tem R$" + ValorString::doubleParaString(cofrinho.obterSaldo()).str() + " reais.");
        

        }

        static void execute07(){
            Printer::printMessageIn("Insira o nome da sala:");
            ValorString nome = Reader::readLine();
            Printer::printMessageLog("Lido " + nome.str());

            Printer::printMessageIn("Insira a temperatura da sala:");
            double temperatura = Reader::readDouble();
            Printer::printMessageLog("Lido " + ValorString::doubleParaString(temperatura).str());
            
            ValorString nivelTemperatura("");
            if (temperatura < 20.0)
                nivelTemperatura = ValorString("Fria");
            else if (temperatura < 25.0)
                nivelTemperatura = ValorString("Confortável");
            else
                nivelTemperatura = ValorString("Quente");

            Printer::printMessageInformation("A sala está " + nivelTemperatura.str());
        }

        static void execute08(){
            Printer::printMessageIn("Informe a disciplina: ");
            ValorString disciplina = Reader::readLine();

            Printer::printMessageIn("Informe os minutos estudados: ");
            int minutos = Reader::readInt();

            Estudo estudo = Estudo(disciplina, minutos);

            Printer::printMessageInformation(
                "Você estudou " 
                + estudo.obterDisciplina().str() 
                + " por " 
                + ValorString::intParaString(estudo.obterMinutos()).str() 
                + " minutos."
            );
            Printer::printMessageInformation(estudo.obterNivelEstudo().str());
        }

        static void execute09(){

            Printer::printMessageIn("Informe o tamanho da camiseta: ");
            ValorString tamanho = Reader::readLine();

            Printer::printMessageIn("Informe a cor da camiseta: ");
            ValorString cor = Reader::readLine();

            Printer::printMessageIn("Informe o preço da camiseta: ");
            double preco = Reader::readDouble();

            Camiseta camiseta = Camiseta(tamanho, cor, preco);

            Printer::printMessageInformation("Categoria de camiseta " + camiseta.obterCategoria().str());
        }

        static void execute10(){
            ListaTarefas listaTarefas = ListaTarefas();
            Printer::printMessageInformation("Informe a quantidade de tarefas para criar: ");
            int quantidade = Reader::readInt();
            listaTarefas.adicionarTarefasPorQuantidade(quantidade);
            listaTarefas.alterarStatusTarefas();

            for(int i = 0; i < quantidade; i++){
                Tarefa tarefa = listaTarefas.obterTarefaPorIndice(i);
                Printer::printMessageInformation("Título: " + tarefa.titulo.str() + " - " + (tarefa.concluida ? "OK" : "Pendente"));
                Printer::printMessageInformation("Descrição: " + tarefa.descricao.str());
            }
        }

        static void execute11(){
            std::vector<EstudanteAcademia> lista;

            int fantasma = 0;
            int iniciante = 0;
            int focado = 0;
            int atleta = 0;

            while (true) {
                Printer::printMessageIn("Informe o nome do estudante: ");
                ValorString nome = Reader::readLine();

                Printer::printMessageIn("Informe a frequência semanal: (informe valor negativo para encerrar) ");
                int freq = Reader::readInt();

                if (freq < 1) {
                    break;
                }

                EstudanteAcademia estudante(nome, freq);
                lista.push_back(estudante);

                // classificação
                if (freq == 0) {
                    fantasma++;
                } else if (freq <= 2) {
                    iniciante++;
                } else if (freq <= 4) {
                    focado++;
                } else {
                    atleta++;
                }
            }

            // resultado final
            Printer::printMessageInformation("Resumo:");
            Printer::printMessageInformation("Plano fantasma: " + ValorString::intParaString(fantasma).str());
            Printer::printMessageInformation("Modo iniciante: " + ValorString::intParaString(iniciante).str());
            Printer::printMessageInformation("Modo focado: " + ValorString::intParaString(focado).str());
            Printer::printMessageInformation("Modo atleta: " + ValorString::intParaString(atleta).str());
        }

        static void execute12(){
            std::vector<IngressoCinema> ingressos;

            double faturamentoTotal = 0;

            while (true) {
                Printer::printMessageIn("Informe o nome do filme (Enter vazio para sair): ");
                ValorString filme = Reader::readLine();

                if (filme.str() == "") {
                    break;
                }

                Printer::printMessageIn("Informe o horário: ");
                ValorString horario = Reader::readLine();

                Printer::printMessageIn("Meia entrada? (S/N): ");
                ValorString resposta = Reader::readLine();

                bool meia = (resposta.str() == "S" || resposta.str() == "s");

                IngressoCinema ingresso(filme, horario, meia);

                ingressos.push_back(ingresso);

                faturamentoTotal += ingresso.obterValor();
            }

            // resultado final
            Printer::printMessageInformation(
                "Total de ingressos vendidos: " + 
                ValorString::intParaString(ingressos.size()).str()
            );

            Printer::printMessageInformation(
                "Faturamento total: R$ " + 
                ValorString::doubleParaString(faturamentoTotal).str()
            );
        }

        static void execute13(){
            std::vector <EstudanteMedia> listaEstudantes = {};
            Printer::printMessageInformation("Vamos criar a turma");
            bool novoAluno = true;
            double notaTotal = 0.0;
            while(novoAluno){
                Printer::printMessageIn("Nome: ");
                ValorString nome = Reader::readLine();

                if (not nome.str().empty()){
                    Printer::printMessageIn("Nota: ");
                    double nota = Reader::readDouble();
                    EstudanteMedia estudante = EstudanteMedia(nome, nota);
                    listaEstudantes.push_back(estudante);
                    notaTotal += nota;
                }
                else
                    novoAluno = false;
            }
        
            if (!listaEstudantes.empty()) {
                double media = notaTotal / listaEstudantes.size();

                Printer::printMessageInformation(
                    "A média da turma é: " + ValorString::doubleParaString(media).str());
            } 
            else {
                Printer::printMessageInformation("Nenhum estudante na lista.");
            }
        }
    
        static void execute14(){
            Jogador jogadores[5] = {
                Jogador(ValorString("Ana"), 100),
                Jogador(ValorString("Bruno"), 200),
                Jogador(ValorString("Carlos"), 150),
                Jogador(ValorString("Diana"), 300),
                Jogador(ValorString("Edu"), 250)
            };
            // Mostrar dados
            Printer::printMessageInformation("Lista de jogadores:");
            int indiceDaMaiorPontuacao = 0;
            int pontuacao = 0;
            for (int i = 0; i < 5; i++){
                Printer::printMessageInformation(
                    jogadores[i].obterNome().str() +
                    " - " +
                    ValorString::intParaString(jogadores[i].obterPontuacao()).str()
                );
                if (jogadores[i].obterPontuacao() > pontuacao){
                    pontuacao = jogadores[i].obterPontuacao();
                    indiceDaMaiorPontuacao = i;}
            }
            Printer::printMessageInformation("Jogador com a maior pontuação é: " + jogadores[indiceDaMaiorPontuacao].obterNome().str());
        }
    
    
        //5° Lista de atividades
        static void execute15(){
            Printer::printMessageIn("Quantidade de alunos: ");
            int n = Reader::readInt();

            Turma turma;

            for (int i = 0; i < n; i++) {
                Printer::printMessageIn("Nota do aluno " + ValorString::intParaString(i + 1).str() + ": ");
                double nota = Reader::readDouble();
                turma.adicionarNota(nota);
            }

            double media = turma.calcularMedia();
            int abaixo6 = turma.contarAbaixo6();
            int entre6e79 = turma.contarEntre6e79();
            int acima8 = turma.contarAcima8();

            Printer::printMessageInformation("Média: " + ValorString::doubleParaString(media).str());
            Printer::printMessageInformation("Abaixo de 6: " + ValorString::intParaString(abaixo6).str());
            Printer::printMessageInformation("Entre 6 e 7.9: " + ValorString::intParaString(entre6e79).str());
            Printer::printMessageInformation("8 ou mais: " + ValorString::intParaString(acima8).str());
        }

        static void execute16(){
            std::vector<ItemPedido> pedido;

            while (true) {
                Printer::printMessageInformation("\n===== MENU LANCHONETE =====");
                Printer::printMessageInformation("1 - Adicionar item");
                Printer::printMessageInformation("2 - Listar itens");
                Printer::printMessageInformation("3 - Ver total");
                Printer::printMessageInformation("0 - Sair");

                Printer::printMessageIn("Escolha uma opção: ");
                int opcao = Reader::readInt();

                if (opcao == 0) {
                    break;
                }

                if (opcao == 1) {
                    Printer::printMessageIn("Nome do item: ");
                    ValorString nome = Reader::readLine();

                    Printer::printMessageIn("Quantidade: ");
                    int qtd = Reader::readInt();

                    Printer::printMessageIn("Preço unitário: ");
                    double preco = Reader::readDouble();

                    ItemPedido item(nome, qtd, preco);
                    pedido.push_back(item);

                    Printer::printMessageInformation("Item adicionado!");
                }

                else if (opcao == 2) {
                    if (pedido.empty()) {
                        Printer::printMessageInformation("Nenhum item no pedido.");
                        continue;
                    }

                    Printer::printMessageInformation("=== ITENS DO PEDIDO ===");

                    for (int i = 0; i < (int)pedido.size(); i++) {
                        ItemPedido item = pedido[i];

                        Printer::printMessageInformation(
                            item.obterNome().str() +
                            " | qtd: " +
                            ValorString::intParaString(item.obterQuantidade()).str() +
                            " | unit: " +
                            ValorString::doubleParaString(item.obterPrecoUnitario()).str() +
                            " | subtotal: " +
                            ValorString::doubleParaString(item.calcularSubtotal()).str()
                        );
                    }
                }

                else if (opcao == 3) {
                    double total = 0.0;

                    for (ItemPedido item : pedido) {
                        total += item.calcularSubtotal();
                    }

                    Printer::printMessageInformation(
                        "TOTAL DO PEDIDO: R$ " +
                        ValorString::doubleParaString(total).str()
                    );
                }

                else {
                    Printer::printMessageAlert("Opção inválida!");
                }
            }
        }


        static void execute17(){
            EstudoDia semana[7] = {
                EstudoDia(ValorString("Segunda"), 0),
                EstudoDia(ValorString("Terca"), 0),
                EstudoDia(ValorString("Quarta"), 0),
                EstudoDia(ValorString("Quinta"), 0),
                EstudoDia(ValorString("Sexta"), 0),
                EstudoDia(ValorString("Sabado"), 0),
                EstudoDia(ValorString("Domingo"), 0)
            };

            int total = 0;

            for (int i = 0; i < 7; i++) {
                Printer::printMessageIn(
                    "Minutos de estudo na " + semana[i].obterDia().str() + ": "
                );

                int minutos = Reader::readInt();
                semana[i].adicionarMinutos(minutos);

                total += minutos;
            }

            int maior = 0;

            for (int i = 1; i < 7; i++) {
                if (semana[i].obterMinutos() > semana[maior].obterMinutos()) {
                    maior = i;
                }
            }

            Printer::printMessageInformation(
                "Total de minutos estudados: " +
                ValorString::intParaString(total).str()
            );

            Printer::printMessageInformation(
                "Dia com maior estudo: " +
                semana[maior].obterDia().str() +
                " (" +
                ValorString::intParaString(semana[maior].obterMinutos()).str() +
                " min)"
            );
        }
        static void execute18(){
            std::vector<LivroBiblioteca> livros;

            while (true) {
                Printer::printMessageIn("Titulo (ou vazio para sair): ");
                ValorString titulo = Reader::readLine();

                if (titulo.str().empty()) {
                    break;
                }

                Printer::printMessageIn("Autor: ");
                ValorString autor = Reader::readLine();

                Printer::printMessageIn("Paginas: ");
                int paginas = Reader::readInt();

                LivroBiblioteca livro(titulo, autor, paginas);
                livros.push_back(livro);
            }


            bool encontrou = false;

            for (LivroBiblioteca livro : livros) {
                if (livro.temMaisDe300Paginas()) {
                    Printer::printMessageInformation(livro.resumir().str());
                    encontrou = true;
                }
            }

            if (!encontrou) {
                Printer::printMessageInformation("Nenhum livro com mais de 300 páginas.");
            }
        }
    };

int main(){
    Main::execute();
    return 0;
}