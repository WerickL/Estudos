repos = list()
dados = dict()
media = 0
while True:
    resp = str(0)
    dados['nome'] = str(input('Nome: ')).capitalize().strip()
    dados['sexo'] = str(input('Sexo: M/F ')).strip().upper()[0]
    dados['idade'] = int(input('Idade: '))
    repos.append(dados.copy())
    while resp not in 'SN':
        resp = str(input('Deseja continuar? ')).strip().upper()[0]
    if resp in 'N':
        break
print(f'{len(repos)} pessoas foram cadastradas')
for c in range(0, len(repos)):
    media += repos[c]['idade']
media = media / len(repos)
print(f'Média de idade é {media}')
print('As mulheres do grupo são:', end=' ')
for c in range(0, len(repos)):
    if repos[c]['sexo'] == 'F':
        print(repos[c]['nome'], end=' ')
print(f'\nAs pesoas com idade maior que a média são:')
for c in range(0, len(repos)):
    if repos[c]['idade'] > media:
        print(f'{repos[c]["nome"]} com {repos[c]["idade"]} de idade')
