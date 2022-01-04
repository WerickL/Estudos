n1 = float(input('Digite a nota 1:'))
n2 = float(input('Digite a nota 2:'))
m = (n1 + n2) / 2
if m < 5:
    print('reprovado!')
elif (m >= 5) and (m < 7):
    print('você está de recuperação!')
else:
    print('Parabéns você foi aprovado!!')
