boletim = list()
notas = list()
aluno = ''
while True:
    res = '0'
    aluno = str(input('Digite o nome do aluno: ')).strip().capitalize()
    boletim.append(aluno)
    nota1 = float(input('Nota 1: '))
    notas.append(nota1)
    nota2 = float(input('Nota 2: '))
    notas.append(nota2)
    boletim.append(notas[:])
    notas.clear()
    while res not in 'SN':
        res = str(input('Quer continuar? S/N ')).strip().upper()
    if res == 'N':
        break
print('-'*20)
tamanho = len(boletim)
for c in range(0, tamanho, 2):
    media = (boletim[c+1][0] + boletim[c+1][1]) / 2
    print(f'{boletim[c]:<15} {media:>}')
print(f'{"Aluno":<}{"Média":->15}')
while True:
    nome = str(input('Qual nome deseja buscar? ("Nenhum" para encerrar)')).strip().capitalize()
    if nome in 'Nenhum':
        break
    if nome in boletim:
        i = boletim.index(nome)
        print(f'O aluno {boletim[i]} obteve as notas: {boletim[i+1]}')
    else:
        print('Aluno não cadastrado!')
