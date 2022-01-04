from lib.inteface import *
from time import sleep
from lib.arquivo import *
arq = 'cursoemvideo.txt'
if not arquivoExiste(arq):
    criarArquivo(arq)

while True:
    resposta = menu(['ver pessoas cadastradas', 'Cadastrar novas pessoas', 'sair do sistema'])
    if resposta == 1:
        cabecalho('Pessoas cadastradas:')
        lerarquivo(arq)
        sleep(2)
    elif resposta == 2:
        cabecalho('NOVO CADASTRO')
        nome = str(input('nome:'))
        idade = leiaint('Idade:')
        cadastrar(arq, nome, idade)
        sleep(2)
    else:
        cabecalho('\033[35mSaindo do sistema...\033[m')
        sleep(2)
        break



