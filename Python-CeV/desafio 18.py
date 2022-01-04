import math
ang = float(input('Digite o ângulo:'))
print('O seno de {}, é igual a:{:.2f}.'.format(ang, math.sin(math.radians(ang))))
print('O cosseno é :{:.2f}.'.format(math.cos(math.radians(ang))))
print('E a tangente é:{:.2f}.'.format(math.tan(math.radians(ang))))
