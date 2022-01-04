val = list()
while True:
    val.append(int(input('Digite um valor.')))
    r = '0'
    while r not in 'SsNn':
        r = str(input('Deseja continuar? S/N')).strip()[0]
    if r in 'Nn':
        break
print(f'você digitou {len(val)} elementos')
if 5 in val:
    print(f'5 está na lista, na posição {val.index(5) + 1}')
else:
    print('5 não está na lista.')
val.sort(reverse=True)
print(f'Em ordem decrescente são {val}')