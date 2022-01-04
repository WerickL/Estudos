Val = int(input('Digite o valor que você quer sacar:'))
c50 = c20 = c10 = c1 = 0
if Val // 50 != 0:
    c50 = Val // 50
    Val = Val % 50
if Val // 20 != 0:
    c20 = Val // 20
    Val = Val % 20
if Val // 10 != 0:
    c10 = Val // 10
    Val = Val % 10
if Val // 1 != 0:
    c1 = Val // 1
if c50 != 0:
    print(f'{c50} Cédulas de R$50.00')
if c20 != 0:
    print(f'{c20} Cédulas de R$20.00')
if c10 != 0:
    print(f'{c10} Cédulas de R$10.00')
if c1 != 0:
    print(f'{c1} Cédulas de R$1.00')