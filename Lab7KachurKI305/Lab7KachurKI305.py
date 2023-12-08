nRows = 0
arr = []
filler = ''

while True:
    try:
        nRows = int(input("Введіть парне число рядків квадратної матриці (мінімум 4): "))
        if nRows >= 4 and nRows % 2 == 0:
            break
        else:
            print("Неправильне число рядків. Введіть парне число більше або рівне 4.")
    except ValueError:
        print("Неправильний формат вводу. Введіть парне число більше або рівне 4.")

# Створюємо матрицю з розмірами nRows x nRows/2
for i in range(nRows):
    arr.append([filler] * (nRows // 2))

filler = input("Введіть символ для заповнення обох квадратів: ")[0]

# Заповнюємо символом filler
for i in range(nRows):
    for j in range(nRows // 2):
        arr[i][j] = filler

# Вивід 1 квадрату
for i in range(nRows // 2):
    print("  " * (nRows // 2), end='')
    for j1 in range(nRows // 2):
        print(arr[i][j1] + " ", end='')
    print()

# Вивід 2 квадрату
for i in range(nRows // 2, nRows):
    for j in range(nRows // 2):
        print(arr[i][j] + " ", end='')
    print()


try:
    with open("MyFile.txt", "w") as fout:
        for i in range(nRows // 2):
            fout.write("  " * (nRows // 2))
            fout.write(arr[i][0] + " ")
            #fout.write("  " * (nRows // 2 - 1))
            fout.write('\n')
        for i in range(nRows // 2, nRows):
            fout.write("  " * (nRows // 2 - 1))
            fout.write(arr[i][-1] + " ")
            fout.write('\n')
except IOError:
    print("Помилка при записі в файл.")
