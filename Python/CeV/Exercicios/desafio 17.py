import math
co = float(input('Digite o valor do cateto oposto:'))
ca = float(input('digite o valor do cateto adjacente:'))
hip = float(math.sqrt(math.pow(co, 2) + math.pow(ca, 2)))
print('O comprimento da hipotenusa é igual a:{:.2f}'.format(hip))
