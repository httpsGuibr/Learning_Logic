programa {
  inclua biblioteca Util
  real saldo = 7777.00, valorpix, deposito, diferenca
  real operacao_saida[1000][2]
  inteiro quantidade_transf = 0
funcao limpamsm(){
  
  limpa()
}
funcao telainicial() {
    real Opcao1
    escreva ("Seja bem vindo ao internet Banking\n")
            escreva ("Escolha uma das opções abaixo:\n")
            escreva("1) Consultar saldo \n")
            escreva("2) Realizar transferencia via Pix \n")
            escreva("3) Simulação de empréstimo \n")
            escreva("4) Consultar extrato")
            escreva("\nDigite a opção: ")

          leia(Opcao1)

          escolha(Opcao1) {
          caso 1:
          limpa()
          consultarsaldo()
          pare
          caso 2:
          limpa()
          transfpix()
          caso 3:
          limpa()
          simuemprest()
          pare
          caso 4:
          limpa()
          consultaextrato()
          pare
          caso contrario:
           escreva ("Opção inválida, tente novamente")
           Util.aguarde(3000)
           limpa()
           telainicial()
          }
      }



funcao consultarsaldo(){ //cdg pronto
  real opcao1
        escreva("\nSaldo:      R$ ", saldo)
        escreva("\n--------------------\n")

            escreva("\n1) Voltar para página inicial \n")
            escreva("2) Encerrar o programa ")
            escreva ("\nEscolha uma opção: ")
            leia (opcao1)
            limpa()
            escolha (opcao1)
           {
            caso 1:
            telainicial()
            pare
            caso 2:
            limpa()
            pare
            caso contrario: 
            escreva ("Opção Inválida !")

            }

      }
funcao transfpix(){ //cdg pronto
    real opcaotransfpix, chavenumerica
    escreva("\nQuanto deseja transferir? ")
    leia(valorpix)
    escreva("Digite a chave numérica da conta: ")
    leia(chavenumerica)
    diferenca = saldo - valorpix
    se(diferenca < 0){
        escreva("Não é possível enviar este valor!")
        escreva("\nTente novamente com um valor menor!\n")
        Util.aguarde(3500)
        limpa()
        transfpix()
    }
    saldo -= valorpix
    
    inteiro posicao_vazia = 0
    enquanto (operacao_saida[posicao_vazia][0] != 0){
        posicao_vazia++
        
        se (posicao_vazia >= 1000){
            escreva("Limite de transferências atingido!")
            pare
        }
    }
    
    operacao_saida[posicao_vazia][0] = valorpix
    operacao_saida[posicao_vazia][1] = chavenumerica
    
    quantidade_transf++
    escreva("Pix efetuado!\n")

    escreva("\n1) Realizar outra transferência \n")
    escreva("2) Voltar para página inicial \n")
    escreva("3) Encerrar o programa ")
    escreva ("\nEscolha uma opção: ")
    leia(opcaotransfpix)
    limpa()
    escolha (opcaotransfpix){
        caso 1:
            transfpix()
            pare
        caso 2:
            telainicial()
            pare
        caso 3:
            limpamsm()
            pare
        caso contrario:
            escreva ("Opção Inválida !")
            pare
    }
  }
funcao simuemprest(){ //cdg pronto
  real valoremprestimo1, valoremprestimo2, valoremprestimo3, juroscaso1, juroscaso2, juroscaso3, montantecaso1, montantecaso2, montantecaso3
  inteiro meses, meses2, meses3, Opcao1, opcao1
  Util.aguarde(2000)
  escreva("Temos as seguintes opções de empréstimo para você: \n")
  Util.aguarde(2000)
  escreva("1)APENAS NESTE MÊS DE DEZEMBRO, 5% AO MÊS, EM ATÉ 3 MESES. \n")
  escreva("2)10% ao mês, em até 6 meses. \n")
  escreva("3)12% ao mês, em até 24 meses\n")
  escreva ("Escolha uma das opções abaixo: ")
            leia(Opcao1)

          escolha(Opcao1) {

          caso 1:
          escreva("Insira o valor que deseja pegar emprestado (em Reais): \n")
          leia(valoremprestimo1)
          escreva("Em quanto tempo deseja quitar o empréstimo (em meses)? \n")
          leia(meses)
          se (meses <= 3) {
          juroscaso1 = ((valoremprestimo1 * 0.05) * meses)
          montantecaso1 = (valoremprestimo1 + juroscaso1)
          escreva("O valor á ser pago ao final com juros é de R$", montantecaso1, ".\n")

        escreva("\n1) Fazer uma nova simulação \n")
        escreva("2) Voltar para página inicial \n")
        escreva("3) Encerrar o programa ")
        escreva ("\nEscolha uma opção: ")
        leia (opcao1)
        limpa()
        escolha (opcao1)
          {
            caso 1:
            simuemprest()
            pare
            caso 2:
            telainicial()
            pare
            caso 3:
            limpa()
            pare
            caso contrario: 
            escreva ("Opção Inválida !")

                }
        pare
          }
          senao {
            escreva("O empréstimo só pode ser realizado com prazo menor ou igual á 3 meses, tente novamente.")
            Util.aguarde(3000)
            limpa()
            simuemprest()
          }
          caso 2:

          escreva("Insira o valor que deseja pegar emprestado (em Reais): \n")
          leia(valoremprestimo2)
          escreva("Em quanto tempo deseja quitar o empréstimo (em meses)? \n")
          leia(meses2)
          se (meses2 <= 12) {
          juroscaso2 = ((valoremprestimo2 * 0.12) * meses2)
          montantecaso2 = (valoremprestimo2 + juroscaso2)
          escreva("O valor á ser pago ao final com juros é de R$", montantecaso2, ".\n")

        escreva("\n1) Fazer uma nova simulação \n")
        escreva("2) Voltar para página inicial \n")
        escreva("3) Encerrar o programa ")
                escreva ("\nEscolha uma opção: ")
                leia (opcao1)
                limpa()
                escolha (opcao1)
                {
                    caso 1:
                    simuemprest()
                    pare
                    caso 2:
                    telainicial()
                    pare
                    caso 3:
                    limpa()
                    pare

                    caso contrario: 
                escreva ("Opção Inválida !")

                }

          pare
          }
          senao {
            escreva("O empréstimo só pode ser realizado com prazo menor ou igual á 24 meses, tente novamente.")
            Util.aguarde(3000)
            limpa()
            simuemprest()
          }
          caso 3:
          escreva("Insira o valor que deseja pegar emprestado (em Reais): \n")
          leia(valoremprestimo3)
          escreva("Em quanto tempo deseja quitar o empréstimo (em meses)? \n")
          leia(meses3)
          se (meses3 <= 24) {
          juroscaso3 = ((valoremprestimo3 * 0.1) * meses3)
          montantecaso3 = (valoremprestimo3 + juroscaso3)
          escreva("O valor á ser pago ao final com juros é de R$", montantecaso3, ".\n")

          escreva("\n1) Fazer uma nova simulação \n")
          escreva("2) Voltar para página inicial \n")
          escreva("3) Encerrar o programa ")
                escreva ("\nEscolha uma opção: ")
                leia (opcao1)
                limpa()
                escolha (opcao1)
                {
                    caso 1:
                    simuemprest()
                    pare
                    caso 2:
                    telainicial()
                    pare
                    caso 3:
                    limpa()
                    pare
                    caso contrario: 
                escreva ("Opção Inválida !")

                }
          pare

          }
          senao {
            escreva("O empréstimo só pode ser realizado com prazo menor ou igual á 24 meses, tente novamente.")
            Util.aguarde(3000)
            limpa()
            simuemprest()
          }
          caso contrario:
          escreva ("Opção Inválida !")
          pare
          }

  }



funcao preenchervetor(){ //cdg pronto
        para(inteiro x = 0; x < 1000; x++){
            operacao_saida[x][0] = 0.0
            operacao_saida[x][1] = 0.0
            }
        }



funcao inicio() {
  real Nconta, Nagencia, Senhamain, Opcao1, saldoinicio, saldoatual
    preenchervetor()

    escreva("Bem vindo ao internet banking\n")
    escreva("Digite o número da sua conta (6 dígitos): ")
    leia(Nconta)
    se (Nconta == 123456) {
        escreva("Digite o número da sua agência (4 dígitos): ")
        leia(Nagencia)
        se (Nagencia == 1234) {
          escreva("Digite sua senha (4 dígitos): ")
          leia(Senhamain)
          se (Senhamain == 4321) {
          escreva("Senha correta!\n")
          escreva("Vamos lhe redirecionar a tela inicial em instantes\n")
          Util.aguarde(3000)
          escreva ("Redirecionando...\n")
          Util.aguarde(3000)
          limpa()
          telainicial()
          }

          senao {
            limpa()
            escreva("Senha inválida\n")
            escreva("Tente novamente\n")
            inicio()
          }


        }
        senao {
          limpa()
          escreva("Agência inválida\n")
          escreva("Tente novamente\n")
          inicio()
        }
    }
    senao {
      limpa()
      escreva("Conta inválida\n")
      escreva("Tente novamente\n")
      inicio()
    }



  }

funcao consultaextrato(){ //codigo pronto
    real opcaoconsultaextrato
    
   
        escreva("\nExtrato")
        escreva("\n----------------------")
        
        para(inteiro x = 0; x < quantidade_transf; x++){
            se(operacao_saida[x][0] > 0){
                escreva("\nPix efetuado :    R$ ", operacao_saida[x][0], " para a conta N° ", operacao_saida[x][1])
            }
        }
        escreva("\nSaldo:      R$ ", saldo)
        escreva("\n1) Voltar para página inicial \n")
        escreva("2) Encerrar o programa ")
        escreva ("\nEscolha uma opção: ")
        leia (opcaoconsultaextrato)
        limpa()

        escolha (opcaoconsultaextrato) {
            caso 1:
                telainicial()
                pare
            caso 2:
                limpamsm()
                pare
            caso contrario:
            escreva ("Opção Inválida !")
        }
    }
}
