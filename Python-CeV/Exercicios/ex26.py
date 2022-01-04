frase = str(input('Digite uma frase:')).lower().strip()
print('A quantidade de letras "a" é:{}'.format(frase.count('a')))
print('A primeira letra "a" está na posição:{}'.format(frase.find('a')))
print('A última letra "a" está na posição:{}'.format(frase.rfind('a')))
