class Cola:
    def __init__(self, n):
        self.arreglo = [0]*n
        self.inicio = -1
        self.fin = -1
        self.n = n
    
    def insert(self, e):
        if self.isFull():
            print("La cola está llena")
        else:
            if self.isEmpty():
                self.inicio = 0
            self.fin += 1
            self.arreglo[self.fin] = e
    
    def remove(self):
        if self.isEmpty():
            print("La cola está vacía")
            return None
        else:
            elemento = self.arreglo[self.inicio]
            self.inicio += 1
            if self.inicio > self.fin:
                self.inicio = self.fin = -1
            return elemento
    
    def peek(self):
        if self.isEmpty():
            print("La cola está vacía")
            return None
        return self.arreglo[self.inicio]
    
    def isEmpty(self):
        return self.inicio == -1
    
    def isFull(self):
        return self.fin == self.n - 1
    
    def size(self):
        if self.isEmpty():
            return 0
        return self.fin - self.inicio + 1

cola = Cola(5)
cola.insert(10)
cola.insert(20)
cola.insert(30)
print("Elemento al frente:", cola.peek())

print("Elemento eliminado:", cola.remove())
print("Elemento al frente:", cola.peek())

cola.insert(40)
cola.insert(50)
cola.insert(60)

print("¿La cola está llena?:", cola.isFull())

print("Tamaño de la cola:", cola.size())

print("Elemento eliminado:", cola.remove())
print("Elemento eliminado:", cola.remove())
print("Elemento eliminado:", cola.remove())
print("Elemento eliminado:", cola.remove())

print("¿La cola está vacía?:", cola.isEmpty())