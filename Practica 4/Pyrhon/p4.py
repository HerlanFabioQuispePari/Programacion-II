from multimethod import multimethod
import math

class CalculadoraArea:
    @multimethod
    def area(self, radio: float):
        return math.pi * radio ** 2

    @multimethod
    def area(self, base: float, altura: float):
        return base * altura

    @multimethod
    def area(self, base_mayor: float, base_menor: float, altura: float):
        return ((base_mayor + base_menor) / 2) * altura

    @multimethod
    def area(self, lado: float, apotema: float, lados: int):
        return (lados * lado * apotema) / 2

calculadora = CalculadoraArea()
print("Área del círculo:", calculadora.area(5.0))
print("Área del rectángulo:", calculadora.area(10.0, 4.0))
print("Área del triángulo rectángulo:", calculadora.area(6.0, 8.0) / 2)
print("Área del trapecio:", calculadora.area(10.0, 6.0, 4.0))
print("Área del pentágono:", calculadora.area(5.0, 3.0, 5))