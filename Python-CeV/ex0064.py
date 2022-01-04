S = cont = val = int(0)
while val != 999:
    val = int(input('digite um valor (999 para encerrar) '))
    if val != 999:
        S = S + val
        cont += 1
print('Os {} termos digitados somam :{}'.format(cont, S))
