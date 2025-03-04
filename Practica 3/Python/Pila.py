class Pila:
    def __init__(self, n):
        self.arreglo = [0]*n
        self.top = -1
        self.n = n            
    
    def push(self, e):
        if self.isFull():
            print("La pila está llena")
        else:
            self.top += 1
            self.arreglo[self.top] = e
    
    def pop(self):
        if self.isEmpty():
            print("La pila está vacía")
            return None
        else:
            elemento = self.arreglo[self.top]
            self.top -= 1
            return elemento
    
    def peek(self):
        if self.isEmpty():
            print("La pila está vacía")
            return None
        else:
            return self.arreglo[self.top]
    
    def isEmpty(self):
        return self.top == -1
    
    def isFull(self):
        return self.top == self.n - 1

pila = Pila(5)
pila.push(10)
pila.push(20)
pila.push(30)
print("Elemento en la cima:", pila.peek())
print("Elemento eliminado:", pila.pop())
print("Elemento en la cima después del pop:", pila.peek())
print("¿Está vacía?:", pila.isEmpty())
print("¿Está llena?:", pila.isFull())