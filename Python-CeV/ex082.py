totais = list()
pares = list()
impares = list()
while True:
    r = '0'
    totais.append(int(input('Digite um valor')))
    while r not in 'SsNn':
        r = str(input('Quer continuar? S/N')).strip()[0]
    if r in 'Nn':
        break
for c in range(0, len(totais)):
    if totais[c] % 2 == 0:
        pares.append(totais[c])
    else:
        impares.append(totais[c])
print('Todos: ', totais)
print('Pares: ', pares)
print('Ímpares: ', impares)
