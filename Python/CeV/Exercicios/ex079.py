valores = list()
while True:
    conti = '0'
    n = int(input('Digite um valor:'))
    if valores.count(n) == 0:
        valores.append(n)
        print('Valor adicionado!')
    else:
        print('valor já adicionado anteriormente!')
    while conti not in 'NnsS':
        conti = str(input('Quer continuar? S/N')).strip()[0]
    if conti in 'nN':
        break
valores.sort()
print(f'Voçê digitou os valores {valores}')
