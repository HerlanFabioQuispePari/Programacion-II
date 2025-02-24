import matplotlib.pyplot as plt

class Punto:
    def __init__(self,x,y):
        self.x=x
        self.y=y
    def getX(self):
        return self.x
    def getY(self):
        return self.y
    def __str__(self):
        return f"X:{self.x}  Y:{self.y}"
        
class Linea:
    def __init__(self,p1,p2):
        self.p1=p1
        self.p2=p2
    def __str__(self):
        return f'Linea de {p1} hasta {p2}'
    def dibujaLinea(self):
        x=[self.p1.getX(), self.p2.getX()]
        y=[self.p1.getY(), self.p2.getY()]
        plt.plot(x,y,marker='o', linestyle='-')
        plt.show
class Circulo:
    def __init__(self,c,r):
        self.c=c
        self.r=r
    def __str__(self):
        return f'Centro: {self.c}  Radio: {self.r}'
    def dibujaCirculo(self):
        centro=(self.c.getX(), self.c.getY())
        radio=self.r
        fig, ax = plt.subplots()
        circulo = plt.Circle(centro, radio, color='b', fill=False)
        ax.add_patch(circulo) 
        ax.set_xlim(centro[0] - radio - 1, centro[0] + radio + 1) 
        ax.set_ylim(centro[1] - radio - 1, centro[1] + radio + 1)
        ax.set_aspect('equal') 
        plt.show()
        
p1 = Punto(0,1)
print(f'Punto 1:\n{p1}')
p2 = Punto(8,5)
print(f'Punto 2:\n{p2}')

linea = Linea(p1,p2)
print(linea)
linea.dibujaLinea()

c=Punto(2,4)
circulo = Circulo(c,4)
print(circulo)
circulo.dibujaCirculo()