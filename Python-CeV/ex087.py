mat = [[], [], []]
somP = som3 = maiorV = 0
for L in range(0, 3):
    for C in range(0, 3):
        val = int(input(f'Digite o valor [{L + 1}][{C + 1}] da matriz: '))
        mat[L].insert(C, val)
for L in range(0, 3):
    for C in range(0, 3):
        print(f'[{mat[L][C]:^5}]', end='')
        if mat[L][C] % 2 == 0:
            somP += mat[L][C]
        if C == 2:
            som3 += mat[L][C]
        if L == 1:
            if C == 0 or (maiorV < mat[L][C] and C != 0):
                maiorV = mat[L][C]
    print()
print(f'A soma de todos os pares é: {somP}')
print(f'A soma de todos os elementos da coluna 3 é: {som3}')
print(f'O maior valor da segunda linha é: {maiorV}')
