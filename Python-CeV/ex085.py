principal = [[], []]
for c in range(0, 7):
    aux = (int(input('Manda:')))
    if aux % 2 == 0:
        principal[0].insert(0, aux)
    else:
        principal[1].insert(0, aux)
principal[0].sort()
principal[1].sort()
print(f'O Valores pares são{principal[0]}')
print(f'Os valores ímpares são{principal[1]}')
