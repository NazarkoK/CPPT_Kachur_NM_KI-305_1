import os
import struct
import sys
import math

# Функція для запису результату у текстовий файл
def writeResTxt(file_name, result):
    with open(file_name, 'w') as file:
        file.write(str(result))

# Функція для читання результату з текстового файлу
def readResTxt(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, 'r') as file:
                result = float(file.read())
        else:
            raise FileNotFoundError(f"Файл {file_name} не знайдено.")
    except FileNotFoundError as e:
        print(e)
    return result

# Функція для запису результату у бінарний файл
def writeResBin(file_name, result):
    with open(file_name, 'wb') as file:
        packed_result = struct.pack('f', result)
        file.write(packed_result)

# Функція для читання результату з бінарного файлу
def readResBin(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, 'rb') as file:
                packed_result = file.read(4)  # читаємо 4 байти (розмір типу float)
                result = struct.unpack('f', packed_result)[0]
        else:
            raise FileNotFoundError(f"Файл {file_name} не знайдено.")
    except FileNotFoundError as e:
        print(e)
    return result

# Функція для обчислення виразу ctg(x) / tg(x)
def calculate_expression(x):
    try:
        if x % 180 == 90:
            raise ValueError("Не можна обчислити тангенс для X = 90° + k * 180°")

        rad = math.radians(x)
        tg_value = math.tan(rad)
        ctg_value = 1.0 / tg_value

        if math.isinf(tg_value) or math.isnan(tg_value):
            raise ValueError("Тангенс недійсний або нескінчений для введеного X")

        if tg_value == 0:
            raise ZeroDivisionError("Знаменник не може дорівнювати нулю!")

        result = ctg_value / tg_value
        return result
    except (ValueError, ZeroDivisionError) as e:
        raise CalcException(str(e))

# клас CalcException
class CalcException(Exception):
    pass

if __name__ == "__main__":
    try:
        data = float(input("Введіть Х: "))
        result = calculate_expression(data)
        print(f"Результат обчислення: {result}")
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        print("Результат з бінарного файлу: {0}".format(readResBin("binRes.bin")))
        print("Результат з текстового файлу: {0}".format(readResTxt("textRes.txt")))
    except CalcException as e:
        print(e)
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)
