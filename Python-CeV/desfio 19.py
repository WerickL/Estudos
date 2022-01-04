import random
a1 = input('qual o nome do primeiro aluno?')
a2 = input('qual o nome do segundo aluno?')
a3 = input('qual o nome do terceiro aluno?')
a4 = input('qual o nome do quarto aluno?')
lista = [a1, a2, a3, a4]
r = (random.choice(lista))
print('o aluno sorteado foi:{}'.format(r))
