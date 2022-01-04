from random import randint

valores = (randint(0, 9), randint(0, 9), randint(0, 9), randint(0, 9), randint(0, 9))
for c in range(0, 5):
    print(valores[c], end=' ')
# print('\nMenor valor foi: ', sorted(valores)[0])
# print('Maior valor foi', sorted(valores)[-1])
print('\nMenor valor foi: ', min(valores))
print('Maior valor foi', max(valores))
