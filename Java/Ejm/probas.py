class Student:
    name: str
    age: int
    
    def __init__(self):
        self.name = 'Abel'
        print('Créase un alumno co nome', self.name)


student1 = Student()
student2 = Student()
student1.name = 'Jorge'
student1.age = 18
student2.name = 'Alberto'
student2.age = 20
print('Alumno 1: ', student1.name, ' Idade: ', student1.age)
print('Alumno 2: ', student2.name, ' Idade: ', student2.age)