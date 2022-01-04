from utilidadesCeV import moeda

val = float(input('Digite o preço:'))
print(f'A metade de {moeda.moeda(val)} é {moeda.metade(val, True)}')
print(f'O dobro de {moeda.moeda(val)} é {moeda.dobro(val, True)}')
print(f'Reduzindo {moeda.moeda(val)} em 20% é igual a {moeda.diminuir(val, 20, True)}')
print(f'aumentando {moeda.moeda(val)} em 10% é igual a {moeda.aumentar(val, 10, True)}')

