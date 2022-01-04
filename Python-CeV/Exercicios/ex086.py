mat = [[], [], []]
for L in range(0, 3):
    for C in range(0, 3):
        val = int(input(f'Digite o valor [{L + 1}][{C + 1}] da matriz: '))
        mat[L].insert(C, val)
for L in range(0, 3):
    for C in range(0, 3):
        print(f'[{mat[L][C]:^5}]', end='')
    print()
# cont = 0
# for L in range(0, 3):
#     for C in range(0, 3):
#         print(f'[ {mat[cont][0]} ]', end='')
#         cont += 1
#     print('\n', end='')
