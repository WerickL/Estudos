N = int(input('Digite um número'))
V = 1
C = N
print(f'{N}! = ', end='')
while C != 1:
    V = V * C
    C += -1
    print(f'{C}', end='')
    print(' x ' if C > 1 else ' = ', end='')
print(V)
