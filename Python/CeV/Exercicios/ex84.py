aux = list()
pesos = list()
mai = 0
men = 0
while True:
    interromper = '0'
    aux.append(str(input('Nome: ')))
    aux.append(float(input('Peso: ')))
    if mai == 0:
        mai = men = aux[1]
    elif aux[1] > mai:
        mai = aux[1]
    elif aux[1] < men:
        men = aux[1]
    pesos.append(aux[:])
    aux.clear()
    while interromper not in 'SN':
        interromper = input('Deseja parar? S/N ').strip().upper()
    if interromper in 'S':
        break
print(f'Foram cadastradas {len(pesos)} pessoas ao todo')
print(f'Com {mai}Kg os mais pesados são: ', end= '')
for p in pesos:
    if p[1] == mai:
        print(p[0], end='')
print(f'\nE os mais leves com {men} Kg são: ', end='')
for p in pesos:
    if p[1] == men:
        print(p[0], end='')
