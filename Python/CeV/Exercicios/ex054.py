maior = 0
menor = 0
for c in range(1, 8):
    p = int(input('Digite a idade da {}° pessoa:'.format(c)))
    if p >= 18:
        maior = maior + 1
    else:
        menor = menor + 1
print('{} pessoa são maiores de idade.\n{} são menores de idade.'.format(maior, menor))
