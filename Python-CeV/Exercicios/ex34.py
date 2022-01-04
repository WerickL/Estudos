r1 = float(input('Digite o comprimento da primeira reta:'))
r2 = float(input('Digite o comprimento da segunda reta:'))
r3 = float(input('Digite o comprimento da seunda reta:'))
R1 = 0
R2 = 0
MR = 0
if r1 > r2:
    if r1 > r3:
        MR = r1
        R1 = r3
        R2 = r2
    elif r1 < r3:
        MR = r3
        R1 = r2
        R2 = r1
elif r2 > r3:
    MR = r2
    R1 = r1
    R2 = r3
elif r3 > r1:
    MR = r3
    R1 = r1
    R2 = r2
if (R1 + R2 != MR) and (R1 + R2 > MR):
    print('Essas retas podem formar um triângulo!')
    if (r1 == r2) and (r2 == r3):
        print('O triângule é equilátero!!')
    elif ((r1 == r2) and (r1 != r3)) or ((r2 == r3) and (r2 != r1)) or ((r1 == r3) and (r1 != r2)):
        print('O triângulo é isósceles!')
    else:
        print('O triângulo é escaleno!')
else:
    print('Essas retas não podem formar um triângulo!')
