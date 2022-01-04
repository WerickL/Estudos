val = list()
for c in range(0, 5):
    val.append(int(input(f'Que valor você deseja na posição {c}: ')))

print(f'O maior valor foi {max(val)}, nas posições: ', end='')
for c in range(0, len(val)):
    if val[c] == max(val):
        print(f'{c}...', end='')
print(f'\nO menor valor foi {min(val)}, nas posições: ', end='')
for c in range(0, len(val)):
    if val[c] == min(val):
        print(f'{c}...', end='')
