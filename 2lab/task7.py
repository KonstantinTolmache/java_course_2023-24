# На вход подается строка s и символ i. Необходимо
# найти количество символов i, расположенных в начале строки.
# Ввод: xyxxyx,x вывод: 1

stroka = input()
simvol = input()
x_v_stroke = 0

for i in stroka:
    if i != simvol:
        break
    elif i == simvol:
        x_v_stroke += 1

print(x_v_stroke)
