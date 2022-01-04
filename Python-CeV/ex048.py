s = 0
v = 0
for c in range(1, 500,):
    if (c % 2 == 1) and (c % 3 == 0):
        v = v + 1
        s = s + c

print('a soma dos {} valores deu: {}'.format(v, s))
