from utilidadesCeV import moeda

val = float(input('Digite o preço:'))
print(f'A metade de {moeda.moeda(val)} é {moeda.moeda(moeda.metade(val))}')
print(f'O dobro de {moeda.moeda(val)} é {moeda.moeda(moeda.dobro(val))}')
print(f'Reduzindo {moeda.moeda(val)} em 20% é igual a {moeda.moeda(moeda.diminuir(val, 20))}')
print(f'aumentando {moeda.moeda(val)} em 10% é igual a {moeda.moeda(moeda.aumentar(val, 10))}')
