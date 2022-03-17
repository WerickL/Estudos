tabela = ('Atlético-MG', 'Palmeiras', 'Fortaleza', 'Flamengo', 'Bragantino', 'Corinthias', 'Internacional',
          'Fluminense', 'Atlhetico-PR', 'Cuiabá','Ceará SC', 'Atlético-GO', 'São Paulo', 'Juventude',
          'América-MG', 'Santos', 'Bahia', 'Grêmio', 'Sport Recife', 'Chapecoense')
print(f'Os 5 primeiros colocados são\n{tabela[0:5]}')
print(f'Os quatro últimos são\n{tabela[-4:]}')
print(sorted(tabela))
print('Chapecoense se encontra na posição {}'.format(tabela.index('Chapecoense')+1))
