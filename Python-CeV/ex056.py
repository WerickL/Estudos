ihmv = 0
im = 0
hmv = 'Erro! Nenhum homem foi cadastrado.'
mqv = 0
for c in range(1, 5):
    print('{}° pessoa:'.format(c))
    n1 = str(input('Qual seu nome? ')).strip().capitalize()
    i1 = int(input('Qual a sua idade? '))
    s1 = str(input('Qual o seu sexo? M/F:')).upper().strip()
    if s1 in 'M,F':
        im = im + i1
        if (s1 == 'M') and (i1 > ihmv):
            hmv = n1
            ihmv = i1
        elif (s1 == 'F') and (i1 < 20):
            mqv = mqv + 1
    else:
        print('Por favor, considere reponder seu sexo apenas com "M" ou "F"')
print('A idade média das pessoas cadastradas é: {}'.format(im / 4))
if ihmv != 0:
    print('O homem mais velho é: {}, com {} anos'.format(hmv, ihmv))
else:
    print(hmv)
if mqv == 1:
    print(f'{mqv} mulher tem menos de 20 anos!')
elif mqv > 1:
    print(f'{mqv} mulheres tem menos de 20 anos!')
else:
    print('Nenhuma mulher tem menos que 20 anos!')
