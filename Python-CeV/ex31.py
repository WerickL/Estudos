# Esse programa calcula o preço de uma passagem baseado em km de distância
print('-------------------------------------------------------------')
print('-------------------TIRE AQUI SUA PASSAGEM!-------------------')
D = int(input('             Qual a distância da viagem em Km?'))
if D <= 200:
    # Se a a distância for menor ou igual a 200km, será cobrado R$0.50 por km
    Pc = D * 0.5
    print(f'-----------------O valor da passagem será R$:{Pc} -----------')
else:
    # se a distância for maior que 200km, será cobrado R$0.45 a cada km
    Pl = D * 0.45
    print(f'-------------O valor da Passagem será R$:{Pl}-----------------')
print('-------------------Obrigado pela preferência!----------------')
print('-------------------------------------------------------------')
