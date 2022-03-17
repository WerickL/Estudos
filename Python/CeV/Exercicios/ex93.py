rendimento = dict()
Jgols = list()
goltemp = 0
repos = list()
while True:
    sair = '0'
    rendimento['jogador'] = str(input('Nome do jogador: ')).capitalize()
    rendimento['partidas'] = int(input('Quantas partidas ele jogou? '))
    for c in range(0, rendimento['partidas']):
        Jgols.append(int(input(f'Quantos gols {rendimento["jogador"]} fez na partida {c + 1}: ')))
        goltemp += Jgols[c]
    rendimento['gols'] = Jgols[:]
    rendimento['total'] = goltemp
    repos.append(rendimento.copy())
    Jgols.clear()
    goltemp = 0
    while sair not in 'SN':
        sair = str(input('Deseja continuar? S/N ')).strip().upper()[0]
    if sair in 'N':
        break
print(f'{"=-"*20}')
print(f'{"Cod Nome":<}{"Gols":^20}{"Total"}')
print(f'{"-"*40}')
for c in range(0, len(repos)):
    print(f'{c} {repos[c]["jogador"]:<} {str(repos[c]["gols"]):^20} {repos[c]["total"]}')
    print(f'{"=-" * 20}')
while True:
    det = int(input('Detalhar rendimento de qual jogador?'))
    if det < len(repos):
        print(f'{"-" * 40}')
        print(f'Levantamento do jogador {repos[det]["jogador"]}')
        for c in range(0, len(repos[det]["gols"])):
            print(f'No jogo {c + 1} ele fez {repos[det]["gols"][c]} gols!')
    elif det == 999:
        break
    else:
        print('Esse jogador não está cadastrado, tente novamente.')
print('Volte sempre!')
